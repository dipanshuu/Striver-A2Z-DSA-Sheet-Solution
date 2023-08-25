//Find number ofsubarrays with sum K
import java.util.*;
class p30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Brute Force Solution
        //TC:O(N2)
        //SC:O(1)
        // int sum=0;int count=0;
        // for(int i=0;i<n;i++){
        //     sum=0;
        //     for(int j=i;j<n;j++){
        //     sum=sum+arr[j];
        //      if(sum==k)
        //         count=count+1;
        //     }
        // }
        // System.out.println("Number of subarrays with sum K "+count);

        //Optimal Solution
        //TC:O(N)
        //SC:O(N)
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;int count=0;
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(map.containsKey(sum-k)){
count=count+map.get(sum-k);
            }
 map.put(sum,map.get(sum)==null?1:map.get(sum)+1);       
        }
        System.out.println("Number of subarrays with sum K "+count);
    }
}