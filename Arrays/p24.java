//Next Permutation
import java.util.*;
class p24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 

//Optimal Solution
//TC:O(4N)
//SC:O(1)
//Striver Solution
//All test cases not passed
int br=-1;
for(int i=n-2;i>=0;i--){
    if(arr[i]<arr[i+1]){
br=i;
break;
    }
}
if(br==-1){
    for(int i=n-1;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
    System.exit(1);
}
int r=0;int ind=0;
for(int l=n-1;l>br;l--){
    if(arr[l]>arr[br]){
r=arr[l];
ind=l;
break;
    }
}
int t1=arr[br];
arr[br]=arr[ind];
arr[ind]=t1;
int k=0;
for(int j=br+1;j<=n/2;j++){
    int t=arr[j];
    arr[j]=arr[n-k-1];
    arr[n-k-1]=t;
    k++;
}
System.out.println("After the processing");
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
}
    }
}