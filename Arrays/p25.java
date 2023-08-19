//Leaders in an Array problem
import java.util.*;
class p25{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 

//Brute Force Solution
//TC:O(N2)
//SC:O(N)
// ArrayList<Integer> ans=new ArrayList<>();
// boolean flag=true;
// for(int i=0;i<n;i++){
//     flag=true;
//     for(int j=i+1;j<n;j++){
//         if(arr[i]<arr[j]){
//             flag=false;
//             break;
//         }
//     }
// if(flag){
// ans.add(arr[i]);
// }
// }
// System.out.println("After processing");
// for(int j=0;j<ans.size();j++)
// System.out.print(ans.get(j)+" ");

//Optimal Solution
//TC:O(2N)
//SC:O(N)
ArrayList<Integer> ans=new ArrayList<>();
int max=Integer.MIN_VALUE;
for(int i=n-1;i>=0;i--){
if(arr[i]>max){
ans.add(arr[i]);
}
max=Math.max(max,arr[i]);
}
Collections.reverse(ans);
System.out.println("After processing");
for(int i=0;i<ans.size();i++)
System.out.print(ans.get(i)+" ");
    }
}