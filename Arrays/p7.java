//Move zeroes to end
import java.util.*;
class p7{
     public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 
//Brute Force Solution
//TC:O(n)
//SC:O(n)
//MS
// ArrayList<Integer> arr1=new ArrayList<>();
// int c=0;
// for(int i=0;i<n;i++){
//     if(arr[i]!=0){
//         arr1.add(arr[i]);
//     }
//     else{
//         c=c+1;
//     }
// }
// for(int i=1;i<=c;i++){
//     arr1.add(0);
// }
// for(int i=0;i<arr1.size();i++){
//     System.out.println(arr1.get(i));
// }

//Optimal Solution
//TC:O(n)
//SC:O(1)
//Striver Solution Two Pointer Approach
int j=-1;
for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1){
            return;
        }
for(int i=j+1;i<n;i++){
    if(arr[i]!=0){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
        j=j+1;
        
    }
    }
for(int k=0;k<n;k++){
    System.out.print(arr[k]+" ");
}
}
}