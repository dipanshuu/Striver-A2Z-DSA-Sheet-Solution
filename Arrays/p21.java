//Best Time to Buy and Sell Stock
import java.util.*;
class p21{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
// int profit=0;int maxP=0;
// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//         if(arr[j]>arr[i]){
// profit=arr[j]-arr[i];
// maxP=Math.max(maxP,profit);
//         }
//     }
// }
// System.out.println("Maximum Profit made will be "+maxP);

//Optimal Solution
//TC:O(N)
//SC:O(1)
//Striver Solution
int min=arr[0];int profit=0;int s=0;int maxP=0;
for(int i=1;i<n;i++){
s=arr[i];
profit=s-min;
maxP=Math.max(maxP,profit);
min=Math.min(min,arr[i]);
}
System.out.println("Maximum Profit is: "+maxP);
    }
}