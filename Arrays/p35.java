//Count number of subarrays with given xor K
import java.util.*;
class p35{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
int target=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
// int res=0;
// int count=0;
// for(int i=0;i<n;i++){
//     res=0;
//     for(int j=i;j<n;j++){
// res=res^arr[j];
// if(res==target){
//     count=count+1;
// }
//     }
// }
// System.out.println("Count of subarrays with xor "+target+" is "+count);

//Optimal Solution
//TC:O(N)
//SC:O(N)
Map<Integer,Integer> map=new HashMap<>();
int count=0;
map.put(0,1);int xR=0;
for(int i=0;i<n;i++){
xR=xR^arr[i];
int a=xR^target;
if(map.containsKey(a)){
    count=count+map.get(a);
}
map.put(xR,map.get(xR)==null?1:map.get(xR)+1);
}
System.out.println("Count of subarrays with xor "+target+" is "+count);
    }
}