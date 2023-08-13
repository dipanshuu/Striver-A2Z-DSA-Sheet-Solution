//Largest element in an array
import java.util.*;
class p1{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
//Brute Force Solution(M)
//Time Complexity O(n2);
//Space Complexity O(1)
// int max=Integer.MIN_VALUE;
// max=arr[0];
// for(int i=0;i<n;i++){    
//     for(int j=i+1;j<n;j++){
//         max=Math.max(max,arr[j]);
//     }
// }
// System.out.println(max);
    

    //Better Solution(MS)
    //TC:O(nlogn)
    // SC:O(1)
    // Arrays.sort(arr);
    // System.out.println(arr[n-1]);

    //Optimal Solution(MS)
    //TC:O(n)
    //SC:O(1)
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
max=Math.max(max,arr[i]);
    }
    System.out.println(max);
    }

}
