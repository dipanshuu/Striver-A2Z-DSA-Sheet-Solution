//Remove duplicates in place from Sorted array
import java.util.*;
class p4{
      public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
//TC:O(n2)
//SC:O(n)
//Brute Force Solution
//Striver Solution
// Set<Integer> a=new HashSet<>();
// for(int i=0;i<n;i++){
// a.add(arr[i]);
// }
// ArrayList<Integer> a1=new ArrayList<>();
// a1.addAll(a);

// for(int i=0;i<a1.size();i++){
//     System.out.print(a1.get(i)+" ");
// }

//Striver Solution
//Optimal Solution
// TC:O(n)
//SC:O(1)
int i=0;
for(int j=1;j<n;j++){
if(arr[i]!=arr[j]){
    i=i+1;
arr[i]=arr[j];

}
else{
    j=j+1;
}
}
for(int k=0;k<=i;k++)
System.out.print(arr[k]+" ");

// ArrayList<Integer> a=new ArrayList<>();
// for(int i=0;i<n;i++){
//     for(int j=i+1;j<n;j++){
//         if((arr[i]==arr[j])&&(arr[i]>0)){
//             arr[i]=-1;
//         }
//     }
// }
// for(int i=0;i<n;i++){
//     if(arr[i]!=-1){
//         a.add(arr[i]);
//     }
// }
// for(int i=0;i<a.size();i++)
// System.out.println(a.get(i)+" ");

//Better Solution
// ArrayList<Integer> a=new ArrayList<>();
// for(int i=0;i<n-1;i++){
//     if(arr[i]==arr[i+1]){
//         arr[i]=-1;

//     }
// }
// for(int i=0;i<n;i++){
//     if(arr[i]!=-1)
//     a.add(arr[i]);
// }
// for(int i=0;i<a.size();i++)
// System.out.print(a.get(i)+" ");

}
}