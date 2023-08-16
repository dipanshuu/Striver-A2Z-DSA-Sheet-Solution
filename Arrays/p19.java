//Rearrange array elements by sign
import java.util.*;
class p19{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//TC:O(4N)
//SC:O(2N)
// int i1=0;int j1=0;
// ArrayList<Integer> ansp=new ArrayList<>();
// ArrayList<Integer> ansn=new ArrayList<>();
// int ans[]=new int[n];
// for(int i=0;i<n;i++)
// {
//     if(arr[i]>0){
// ansp.add(arr[i]);
//     }
// }
// for(int j=0;j<n;j++){
//     if(arr[j]<0)
//    ansn.add(arr[j]);
// }
// int y=0;int z=0;
// for(int j=0;j<n;j++){
//     if(j%2==0){
// ans[j]=ansp.get(y);
// y++;
//     }
//     else{
// ans[j]=ansn.get(z);
// z++;
//     }
// }
// System.out.println("After processing: ");
// for(int a=0;a<ans.length;a++)
// System.out.print(ans[a]+" ");

//Optimal Solution
//TC:O(2N)
//SC:O(N)
int pos=0;
int neg=1;
int ans[]=new int[n];
for(int i=0;i<n;i++){
if(arr[i]>0){
ans[pos]=arr[i];
pos=pos+2;
}
else{
ans[neg]=arr[i];
neg=neg+2;
}
}
for(int x=0;x<n;x++)
System.out.print(ans[x]+" ");
 }
}