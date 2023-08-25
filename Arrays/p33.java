//3-Sum Problem
import java.util.*;
class p33{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Brute Force Solution
        //TC:O(N3)
        //SC:O(1)
        // for(int i=0;i<n-2;i++){
        //     for(int j=i+1;j<n-1;j++){
        //         for(int k=j+1;k<n;k++){
        //             if((i!=j)&&(j!=k)&&(k!=i)){
        //                 if((arr[i]+arr[j]+arr[k])==0){
        //                     System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
        //                 }
        //             }
        //         }
        //     }
        // }

        //Better Solution
        //TC:(N+N2+N+N2)
        //SC:O(N2+N+N)
//         ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//         ArrayList<Integer> subAns=new ArrayList<>();
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++)
//         map.put(arr[i],i);
//         for(int i=0;i<n-1;i++){
//             for(int j=i+1;j<n;j++){
//                 subAns=new ArrayList<>();
// if((map.containsKey(0-(arr[i]+arr[j])))){
//     int o=0-(arr[i]+arr[j]);
//     if((map.get(o)!=j)&&(map.get(o)!=i)){
// subAns.add(arr[i]);
//     subAns.add(arr[j]);
//     subAns.add(o);
//     }
// }
// Collections.sort(subAns);
// boolean flag=false;
// for(int k=0;k<ans.size();k++)
// {
//     flag=false;
//     if(subAns.equals(ans.get(k))){
//         flag=true;
//         break;
//     }
// }
// if(!flag){
//     if(subAns.size()>0)
// ans.add(subAns);
// }
//             }
//         }
//         for(ArrayList<Integer> l:ans){
//             for(int m:l){
//                 System.out.print(m+" ");
//             }
//             System.out.println();
//         }

       //Two-Pointer Technique 
       //TC:O(N2)
       //SC:O(N2+N)
       //Logic is correct but the program is not running
       Arrays.sort(arr);
       int i=0;int j=i+1;
       int k=n-1;
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
       ArrayList<Integer> subA=new ArrayList<>();
       while(i<n){
        subA=new ArrayList<>();
        if((i>0)&&(arr[i]==arr[i-1])){
            continue;
        }
while(j<k){
if(arr[i]+arr[j]+arr[k]<0){
    j++;
    }
else if(arr[i]+arr[j]+arr[k]>0){
    k--;
}
else if(arr[i]+arr[j]+arr[k]==0){
subA.add(arr[i]);
subA.add(arr[j]);
subA.add(arr[k]);
j++;
k--;
while((j<k)&&(arr[j]==arr[j-1])){
    j++;
}
while((j<k)&&(arr[k]==arr[k+1]))
k--;
}
       }
       if(subA.size()!=0)
       ans.add(subA);
       i=i+1;
       }
       for(ArrayList<Integer> l:ans){
        for(int m:l){
            System.out.print(m+" ");
        }
        System.out.println();
       }
    }
}