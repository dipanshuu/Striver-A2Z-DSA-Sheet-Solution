//4-Sum Problem
import java.util.*;
class p34{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int target=sc.nextInt();

        //Brute Force Solution
        //TC:O(N4)
        //SC:O(1)
//         for(int i=0;i<n-3;i++){
//             for(int j=i+1;j<n-2;j++){
//                 for(int k=j+1;k<n-1;k++){
//                     for(int l=k+1;l<n;l++){
// if(arr[i]+arr[j]+arr[k]+arr[l]==target){
//     System.out.println("Elements are: "+arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]);
// }
//                     }
//                 }
//             }
//         }

        //Better Solution
        //TC:O(N3)
        //SC:O(N+N2+N)
        //Not Giving Correct Output for multiple test cases
//         Map<Integer,Integer> map=new HashMap<>();
//         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//         ArrayList<Integer> subAns=new ArrayList<>();
//         for(int i=0;i<n;i++)
//         map.put(i,arr[i]);
//         for(int i=0;i<n-2;i++){
// for(int j=i+1;j<n-1;j++){
//     for(int k=j+1;k<n;k++){
//         subAns=new ArrayList<>();
// int el=target-(arr[i]+arr[j]+arr[k]);
// if(map.containsValue(el)){
//     if((map.get(i)!=el)&&(map.get(j)!=el)&&(map.get(k)!=el)){
//       subAns.add(arr[i]);
//       subAns.add(arr[j]);
//       subAns.add(arr[k]);
//       subAns.add(el);  
//     }
// }
//     }
//     Collections.sort(subAns);
//     boolean flag=false;
//     for(int l=0;l<ans.size();l++){
//         if(subAns.equals(ans.get(l))){
// flag=true;
// break;
//         }
//     }
//     if(!flag){
// if(subAns.size()!=0)
//     ans.add(subAns);
//     }
// }
//         }
//         for(ArrayList<Integer> a:ans){
//             for(int b:a){
//                 System.out.print(b+" ");
//             }
//             System.out.println();
//         }

        //Optimal Solution
        //TC:O(N3+NlogN)
        //SC:O(N*N+N)
        //All test cases not passed
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> subAns=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if((i>0)&&(arr[i-1]==arr[i])){
                continue;
            }
            for(int j=i+1;j<n;j++){
         int k=j+1;
            int l=n-1;
    if((j!=(i+1))&&(arr[j-1]==arr[j])){
                continue;
            }
            while(k<l){
                subAns=new ArrayList<>();
                if(arr[i]+arr[j]+arr[k]+arr[l]==target){
subAns.add(arr[i]);
subAns.add(arr[j]);
subAns.add(arr[k]);
subAns.add(arr[l]);
k++;l--;
while((k<l)&&(arr[k-1]==arr[k])){
                    k++;
                }
                while((k<l)&&(arr[l-1]==arr[l])){
                    l--;
                }
                }
                else if((arr[i]+arr[j]+arr[k]+arr[l])<target){
                    k=k+1;
                }
                else if((arr[i]+arr[j]+arr[k]+arr[l])>target){
                    l=l-1;
                }

                if(subAns.size()>0)
                ans.add(subAns);
            }
            }
    }
        for(ArrayList<Integer> list:ans){
            for(int l:list){
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}