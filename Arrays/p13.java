//Find the number that appears once, and other numbers twice
import java.util.*;
class p13{
    public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
// for(int i=0;i<n;i++){
//     boolean flag=false;
//     for(int j=0;j<n;j++){
//         if((arr[i]==arr[j])&&(i!=j)){
// flag=true;
// break;
//         }
//     }
//     if(flag==false){
//         System.out.println("Number is"+arr[i]);
//         break;
//     }
// }

//Better Solution
//TC:O(2N)
//SC:O(N)
// int max=arr[n-1];
// int count[]=new int[max+1];
// for(int i=0;i<n;i++){
//     count[arr[i]]=count[arr[i]]+1;
// }
// for(int i=1;i<count.length;i++){
//     if(count[i]==1){
//         System.out.println("Number is"+i);
//         break;
//     }
// }

//Better Solution 2
//TC:O(2N)
//SC:O(N)
Map<Integer,Integer> mp=new HashMap<>();
for(int i=0;i<n;i++){
    mp.put(arr[i],mp.get(arr[i])==null?1:mp.get(arr[i])+1);
}
for(int i=0;i<n;i++){
    if(mp.get(arr[i])==1){
        System.out.println("Number is"+arr[i]);
        break;
    }
}

//Optimal Solution
//TC:O(N)
//SC:O(1)
// int ans=0;
// for(int i=0;i<n;i++){
// ans=ans^arr[i];
// }
// System.out.println("Number is "+ans);
    }
}