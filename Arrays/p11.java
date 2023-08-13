//Missing Number
import java.util.*;
class p11{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int n1=sc.nextInt();
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//TC:O(n1*n)
//SC:O(1)
//Striver Solution

// boolean flag=false;
// for(int i=1;i<=n1;i++){
//     flag=false;
//     for(int j=0;j<n;j++){
//         if(arr[j]==i){
// flag=true;
//         }
//     }
//     if(!flag){
//         System.out.println(i);
//     }
// }

//Better Solution
//TC:O(2n)
//SC:O(n1)
//Striver Solution
// int hashArr[]=new int[n1+1];
// for(int i=0;i<n;i++){
//     hashArr[arr[i]]=1;
// }
// for(int j=1;j<hashArr.length;j++){
//     if(hashArr[j]!=1){
//         System.out.println(j);
//         break;
//     }
// }

//Optimal Solution
//TC:O(n)
//SC:O(1)
//My Solution
// int sn=n1*(n1+1)/2;
// int sn1=0;
// for(int i=0;i<n;i++){
//     sn1=sn1+arr[i];
// }   
// System.out.println("After processing"+sn);
// System.out.println("Missing Number is"+(sn-sn1));

//Optimal Solution 2
//TC:O(2n)
//SC:O(1)
//Striver Solution
// int x=0;
// for(int i=1;i<=n1;i++)
// x=x^i;
// for(int i=0;i<n;i++){
// x=x^arr[i];
// }
// System.out.println(x);

//Optimal Solution 3
//TC:O(n)
//SC:O(1)
//Striver Solution
int x=0;
for(int i=0;i<n;i++){
x=x^arr[i];
x=x^(i+1);
}
x=x^n1;
System.out.println(x);
    }
}