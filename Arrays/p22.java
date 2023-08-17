//Print all Permutations of a string/array
//Approach-1
import java.util.*;
class p22{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt(); 

//TC:O(N*N!)
//SC:O(N+N)
//Striver Solution
    ArrayList<ArrayList<Integer>> ans=permute(arr);  
    for(ArrayList<Integer> a:ans){
        for(int b:a){
            System.out.print(b+" ");
        }
        System.out.println();
    }  
    }
    public static ArrayList<ArrayList<Integer>> permute(int arr[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        recPermute(arr,ans,ds,freq);
        return ans;
    }
    public static void recPermute(int arr[],ArrayList<ArrayList<Integer>> ans,List<Integer> ds,boolean freq[]){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                recPermute(arr,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
}