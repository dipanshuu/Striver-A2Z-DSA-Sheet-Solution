//Maximum Consecutive Ones
import java.util.*;
class p12{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
// int count=0;
// int maxC=0;
// for(int i=0;i<n;i++){
//     if(arr[i]==1){
//         count=1;
//     for(int j=i+1;j<n;j++){
// if(arr[j]==0){
//     break;
// }
// count=count+1;
//     }
// maxC=Math.max(maxC,count);

//     }
// }
// System.out.println("Maximum Consecutive Ones"+maxC);

//Optimal Solution
//TC:O(N)
//SC:O(1)
//MS
int count=1;
int maxC=0;
for(int i=0;i<n;i++){
    if(arr[i]==1){
if((i!=n-1)&&(arr[i]==arr[i+1])){
count=count+1;
}
else{
    maxC=Math.max(maxC,count);
    count=1;
}
    }

}
System.out.println("Maximum Consecutive Ones"+maxC);
    }
}