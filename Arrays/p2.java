//Second Largest Element in an array without sorting
import java.util.*;
class p2{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
//Brute Force Solution(MS)
// TC:O(nlogn)
//SC:O(1)
Arrays.sort(arr);
for(int i=n-2;i>=0;i--){
    if(arr[i]<arr[n-1]){
        System.out.println(arr[i]);
        break;
    }
}

//Better Solution(MS)
//TC:O(2n)
//SC:O(1)
//  int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
       
//         int secMax=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if((arr[i]>secMax)&&(arr[i]<max)){

//                     secMax=arr[i];
//                 }
//             }
//         if(secMax!=Integer.MIN_VALUE)
//         System.out.println(secMax);
//         else
//         System.out.println(-1);

//Optimal Solution(MS)
//TC:O(n)
//SC:O(1)
//All test cases not passed
// int secM=arr[0];
// int large=arr[0];
// for(int i=1;i<n;i++){
//     if(arr[i]>large){
//         secM=large;
// large=arr[i];
//     }
//     else if((arr[i]<large)&&(arr[i]>secM))
//         {
//         secM=arr[i];
//     }
// }
// System.out.println(secM);
    }
}
