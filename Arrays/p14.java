//Longest subarray with given sum(Positives)
import java.util.*;
class p14{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int k=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
//MS
// int sum=0;int len=0;int maxL=0;
// for(int i=0;i<n;i++){
//     sum=arr[i];
//     len=0;
//     for(int j=i+1;j<n;j++){
// sum=sum+arr[j];
// if(sum<=k){
//     if(sum==k){
// len=j-i+1;
//     }
// }
// else{
//     break;
// }
//     }
//     maxL=Math.max(maxL,len);
// }
// System.out.println(maxL);

//Better Solution
//TC:O(N)
//SC:O(N)
//Striver Solution
//All test cases not passed
// int ans=0;
// int l=0;
// Map<Integer,Integer> mp=new HashMap<>();
// for(int i=0;i<n;i++){
//     sum=sum+arr[i];
//     mp.put(sum,i);
//     if(mp.containsKey(sum-k)){
// l=i-mp.get(sum-k);
// ans=Math.max(ans,l);
//     }

// }
// System.out.println("Longest subarray is"+ans);

//Optimal Solution
//TC:O(N)
//SC:O(1)
//Striver Solution
//All test cases not passed
int j=0;int sum=0;int len=0;int maxL=0;
for(int i=0;i<n;i++){
sum=sum+arr[i];
if(sum<=k){
if(sum==k){
    len=i-j+1;
    maxL=Math.max(maxL,len);
}
}
else{
    sum=sum-arr[j];
    j=j+1;
    
}
}
System.out.println("Longest Subarray is "+maxL);
}
}