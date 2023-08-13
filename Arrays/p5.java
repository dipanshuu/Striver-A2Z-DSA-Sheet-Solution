//Left Rotate an array by one place
import java.util.*;
class p5{
   public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 
//Optimal Solution MS
//TC:O(n)
//SC:O(1)
int temp=arr[0];
int i=0;
for(int j=1;j<n;j++){
    arr[i]=arr[j];
    i++;
}
arr[n-1]=temp;
for(int k=0;k<n;k++)
System.out.print(arr[k]+" ");
}
}