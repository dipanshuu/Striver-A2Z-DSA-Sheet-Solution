//Longest Consecutive Sequence in an Array
import java.util.*;
class p26{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();  

//Brute Force Solution
//TC:O(N3)
//SC:O(1)
// int count=1;int maxC=Integer.MIN_VALUE;boolean flag=false;
// for(int i=0;i<n;i++){
// count=1;
//     for(int j=arr[i]+1;;j++){
//         flag=false;
//         for(int k=0;k<n;k++){
//             if(k!=i){
// if(j==arr[k]){
//     flag=true;
//     count=count+1;
// }
//             }
//         }
//         if(!flag){
//             break;
//         }
//         }
//     maxC=Math.max(maxC,count);
// }
// System.out.println("Longest Consecutive Sequence in an Array "+maxC);

//Better Solution
//TC:O(NlogN+N)
//SC:O(1)
// Arrays.sort(arr);
// int count=1;int maxC=Integer.MIN_VALUE;
// for(int i=0;i<n-1;i++){
// if((arr[i+1]-arr[i])==1){
// count=count+1;
// }
// else{
// maxC=Math.max(maxC,count);
// count=1;
// }
// }
// System.out.println("Longest Consecutive Sequence in an Array "+maxC); 

//Optimal Solution
//TC:O(2N+N)
//SC:O(N)
Set<Integer> set=new HashSet<>();
for(int i=0;i<n;i++){
    set.add(arr[i]);
}
int c=1;int maxC=1;
for(int i=0;i<n;i++){
    if(!(set.contains(arr[i]-1))){
        c=1;
        for(int j=arr[i]+1;;j++){
if(set.contains(j)){
    c=c+1;
}
else{
    break;
}
        }
    }
    maxC=Math.max(maxC,c);
}
System.out.println("Longest Consecutive Sequence in an Array "+maxC);
    }
}