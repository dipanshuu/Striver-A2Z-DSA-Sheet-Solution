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
// int count[]=new int[3];
// for(int i=0;i<n;i++){
//     count[arr[i]]=count[arr[i]]+1;
// }
// System.out.println(count[0]+" "+count[1]+" "+count[2]);
// int i=0;
// for(i=0;i<count[0];i++)
// arr[i]=0;
// for(;i<count[0]+count[1];i++)
// arr[i]=1;
// for(;i<count[0]+count[1]+count[2];i++)
// arr[i]=2;
// for(int j=0;j<n;j++)
// System.out.print(arr[j]+" ");

//Optimal Solution
//Dutch National Flag Algorithm
//TC:O(N)
//SC:O(1)
//MS
int low=0;
int mid=0;
int high=n-1;
while(mid!=high+1){
    if(arr[mid]==0){
        int t=arr[low];
        arr[low]=arr[mid];
        arr[mid]=t;
        mid=mid+1;
        low=low+1;
    }
    else if(arr[mid]==1){
        mid=mid+1;
    }
    else if(arr[mid]==2){
int t=arr[mid];
arr[mid]=arr[high];
arr[high]=t;
high--;
    }
}
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}

}
}