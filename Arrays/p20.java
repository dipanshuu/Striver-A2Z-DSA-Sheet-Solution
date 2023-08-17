//Rearrange array elements by sign
//Variety 2
import java.util.*;
class p20{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();          

//Brute Force Solution
TC:O(2N)
SC:O(3N)
//MS
ArrayList<Integer> pos=new ArrayList<>();
ArrayList<Integer> neg=new ArrayList<>();
int ans[]=new int[n];
for(int i=0;i<n;i++){
    if(arr[i]<0)
    neg.add(arr[i]);
    else
    pos.add(arr[i]);
}
int min=0;
if(pos.size()<neg.size())
min=pos.size();
else
min=neg.size();
int p=0;int n1=0;
for(int i=0;i<2*min;i++){
if(i%2==0)
{
ans[i]=pos.get(p);
p++;
}
else{
    ans[i]=neg.get(n1);
    n1++;
}
}
    if(pos.size()!=min){
        for(int j=2*min;j<n;j++){
            ans[j]=pos.get(p);
            p++;
        }
    }
    else{
        for(int j=2*min;j<n;j++){
            ans[j]=neg.get(n1);
            n1++;
        }
    }
System.out.println("After processing");
    for(int y=0;y<n;y++)
    System.out.print(ans[y]+" ");
}
}