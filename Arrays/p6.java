//Left Rotate an array by  D places
import java.util.*;
class p6{
       public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 
int d=sc.nextInt();
//Better Solution
//MS
//TC:O(n+d)
//SC:O(d)
// if(d>n){
//     d=d%n;
// }
// ArrayList<Integer> a=new ArrayList<>();
// for(int i=0;i<d;i++){
//     a.add(arr[i]);
// }
// int k=0;
// for(int j=d;j<n;j++){
// arr[k]=arr[j];
// k=k+1;
// }
// int m=0;
// for(int l=n-d;l<n;l++){
// arr[l]=a.get(m);
// m=m+1;
// }
// for(int o=0;o<n;o++){
//     System.out.print(arr[o]+" ");
// }

//Optimal Solution
//Striver Solution
// TC:O(2n)
// SC:O(1)
if(d>n){
     d=d%n;
}
for(int i=0;i<d/2;i++){
    int t=arr[i];
    arr[i]=arr[d-i-1];
    arr[d-i-1]=t;
}
int k=0;
for(int i=d;i<(n+d)/2;i++){
    int t=arr[i];
    arr[i]=arr[n-1-k];
    arr[n-1-k]=t;
    k=k+1;
}

for(int i=0;i<n/2;i++){
    int t=arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=t;
}
System.out.println("After processing");
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
}
}