//Merge Overlapping Subintervals
import java.util.*;
class p36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        //Brute Force Solution
        //TC:O(NlogN+2N)
        //SC:O(N)
//         Arrays.sort(arr,new Comparator<int[]>(){
//             public int compare(int a[],int b[]){
//                 return a[0]-b[0];
//             }
//         });
//         List<List<Integer>> ans=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             int start=arr[i][0];
//             int end=arr[i][1];
//  if((!ans.isEmpty())&&(end<=ans.get(ans.size()-1).get(1))){
//     continue;
//  }
//  for(int j=1;j<n;j++){
//     if(arr[j][0]<=end){
// end=Math.max(end,arr[j][1]);
//     }
//     else
//     break;
//  }
//  ans.add(Arrays.asList(start,end));
//         }
//        for(List<Integer> a:ans){
//         for(int b:a){
//             System.out.print(b+" ");
//         }
//         System.out.println();

//Optimal Solution
//TC:O(NlogN+N+2*N)
//SC:O(2*N)
Arrays.sort(arr,new Comparator<int[]>(){
            public int compare(int a[],int b[]){
                return a[0]-b[0];
            }
        });
        List<List<Integer>> ans=new ArrayList<>();
       for(int i=0;i<n;i++){
        if((ans.isEmpty())||(arr[i][0]>ans.get(ans.size()-1).get(1))){
            ans.add(Arrays.asList(arr[i][0],arr[i][1]));
        }
        else{
            ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),arr[i][1]));
        }
       }
       for(List<Integer> a:ans){
        for(int b:a){
            System.out.print(b+" ");
        }
        System.out.println();
       }
    }
}