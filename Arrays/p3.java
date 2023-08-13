//Check if the array is sorted
import java.util.*;
class p3{
     public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
//Brute Force Solution MS
//TC:O(n2)
//SC:O(1)
// boolean flag=true;
// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
// if(arr[i]>arr[j]){
//     flag=false;
//     break;
// }
//     }
//     if(!flag){
//         break;
//     }
// }
// if(flag){
//     System.out.println("Array is sorted");
// }
// else{
//     System.out.println("Array is not sorted");
// }

//Optimal Solution MS
//TC:O(n)
//SC:0(1)
boolean flag=true;
for(int i=0;i<n-1;i++){
    if(arr[i]>arr[i+1]){
flag=false;
break;
    }
}
if(flag){
    System.out.println("Array is sorted");
}
else{
    System.out.println("Array is not sorted");
}
}
}