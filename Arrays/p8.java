//Linear Search
import java.util.*;
class p8{
     public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int num=sc.nextInt();
//Optimal Solution
//TC:O(N)
//SC:O(1)
//MS
boolean flag=false;
for(int i=0;i<n;i++){
    if(arr[i]==num){
        flag=true;
        System.out.println(i);
        break;
    }
}
if(!flag){
    System.out.println(-1);
}
}
}