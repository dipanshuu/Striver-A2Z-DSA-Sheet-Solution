//2Sum Problem
import java.util.*;
class p15{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();
int target=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
//MS
// int a=0;
// boolean flag=false;
// for(int i=0;i<n;i++){
//     a=target-arr[i];
//     for(int j=i+1;j<n;j++){       
//         if(i!=j){
// if(arr[j]==a){
//     flag=true;
//     System.out.println("At index "+i+" "+j);
//     break;
// }
//         }
//     }
//     if(flag)
//     break;
// }
// if(flag==false){
//     System.out.println(-1);
// }

//Better Solution
//TC:O(N)
//SC:O(N)
//MS
// Map<Integer,Integer> mp=new HashMap<>();
// boolean flag=false;
// for(int i=0;i<n;i++){
//     if(mp.containsKey(target-arr[i])){
//         flag=true;
//         System.out.println("Element present at index"+i+","+mp.get(target-arr[i]));
//     }
//      mp.put(arr[i],i);
// }
// if(flag==false){
//     System.out.println(-1);
// }

//Optimal Solution
//TC:O(N)
//SC:O(1)
//Striver Solution
//Two Pointer Approach
Arrays.sort(arr);
int i=0;
int j=n-1;
boolean flag=false;
while(i<j){
int s=arr[i]+arr[j];
if(s<target){
    i++;
}
else if(s>target){
    j--;
}
else{
    flag=true;
    System.out.println("Yes");
    break;
}
}
if(!flag){
    System.out.println("No");
}
}
}