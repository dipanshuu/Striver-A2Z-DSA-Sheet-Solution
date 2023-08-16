//Kadane's Algorithm,maximum subarray sum
import java.util.*;
class p18{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
// int sum=0;
// int maxS=Integer.MIN_VALUE;
// for(int i=0;i<n;i++){
//     sum=arr[i];
//     maxS=Math.max(maxS,sum);
//     for(int j=i+1;j<n;j++){
// sum=sum+arr[j];
// maxS=Math.max(maxS,sum);
//     }
// }
// System.out.println("Max subarray sum: "+maxS);

//Optimal Solution
// Kadane's Algorithm
//TC:O(N)
//SC:O(1)
int maxS=Integer.MIN_VALUE;
int sum=0;int s=0;int e=0;
for(int i=0;i<n;i++){
    if(sum==0)
    s=i;
    sum=sum+arr[i];
    // maxS=Math.max(maxS,sum);
    if(maxS<sum){
        maxS=sum;
        e=i;
    }
    if(sum<0)
    sum=0;   
}
// System.out.println("Maximum subarray sum:"+maxS);
System.out.println("Maximum subarray sum is from: "+s+" to "+e);
}
}