//Find the intersection of two sorted arrays
import java.util.*;
class p10{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
ArrayList<Integer> arr3=new ArrayList<>();
int arr1[]=new int[n];
int arr2[]=new int[m];
for(int i=0;i<n;i++)
arr1[i]=sc.nextInt();
for(int i=0;i<m;i++)
arr2[i]=sc.nextInt(); 

//Brute Force Solution
//TC:O(n*m)
//SC:O(Math.min(n,m))
// for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//         if(arr1[i]==arr2[j]){
//             arr3.add(arr1[i]);
//             arr1[i]=-1;
//             arr2[j]=-2;
//         }
//     }
// }
// System.out.println("After processing");
// for(int i=0;i<arr3.size();i++)
// System.out.print(arr3.get(i)+" ");

//Optimal Solution
//Two Pointer Approach
//TC:O(Math.min(n,m))
//SC:O(Math.min(n,m))
//My Solution
int i=0;
int j=0;
while((i<n)&&(j<m)){
    if(arr1[i]==arr2[j]){
        arr3.add(arr1[i]);
        i++;
        j++;
    }
    else{
        i++;
    }
}
System.out.println("After processing");
for(int k=0;k<arr3.size();k++)
System.out.print(arr3.get(k)+" ");
    }
}