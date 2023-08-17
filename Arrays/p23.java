//Print all Permutations of a string/array
//Approach-2
import java.util.*;
class p23{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();   

//TC:O(N*N!)
//SC:O(1)
ArrayList<ArrayList<Integer>> ans=perm(arr);  
for(ArrayList<Integer> a:ans){
    for(int b:a){
        System.out.print(b+" ");
    }
    System.out.println();
}
}
public static ArrayList<ArrayList<Integer>> perm(int arr[]){
    ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
    recPerm(0,arr,ans);
    return ans;
}
public static void recPerm(int index,int arr[],ArrayList<ArrayList<Integer>> ans){
    if(index==arr.length){
ArrayList<Integer> ds=new ArrayList<>();
for(int i=0;i<arr.length;i++){
    ds.add(arr[i]);
}
ans.add(new ArrayList<>(ds));
return;
    }
      for(int i=index;i<arr.length;i++){
        int t=arr[i];
        arr[i]=arr[index];
        arr[index]=t;
        recPerm(index+1,arr,ans);
        int t1=arr[i];
        arr[i]=arr[index];
        arr[index]=t1;
    }
}
}