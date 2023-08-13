//Sort an array of 0's 1's and 2's 
import java.util.*;
class p16{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//Sorting Algorithms
//TC:O(NlogN)
//SC:O(N)
//Striver Solution

//Better Solution
//TC:O(3N)
//SC:O(3)
int count[]=new int[3];
for(int i=0;i<n;i++){
    count[arr[i]]=count[arr[i]]+1;
}
System.out.println(count[0]+" "+count[1]+" "+count[2]);
int i=0;
for(i=0;i<count[0];i++)
arr[i]=0;
for(;i<count[0]+count[1];i++)
arr[i]=1;
for(;i<count[0]+count[1]+count[2];i++)
arr[i]=2;
for(int j=0;j<n;j++)
System.out.print(arr[j]+" ");

//Optimal Solution
}
}