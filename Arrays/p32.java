//Majority Element(n/3 times)
import java.util.*;
class p32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Brute Force Solution
        //TC:O(N2)
        //SC:O(2)
//         int minC=n/3;boolean flag=false;int c=0;
//         ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=0;i<n;i++){
//             flag=false;c=0;
//             for(int j=0;j<i;j++){
//                 if(arr[i]==arr[j]){
//                     flag=true;
//                     break;
//                 }
//             }
//             if(!flag){
//                 for(int j=0;j<n;j++){
// if(arr[i]==arr[j]){
//     c=c+1;
// }
//                 }
//                 if(c>minC){
// ans.add(arr[i]);
//                 }
//             }
//         }
//         for(int i=0;i<ans.size();i++){
//             System.out.print(ans.get(i)+" ");
//         }

        //Better Solution 1
        //TC:O(NlogN+N+N)
        //SC:O(2)
//         Arrays.sort(arr);int c=1;
//         ArrayList<Integer> ans=new ArrayList<>();
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]==arr[i+1]){
// c=c+1;
//             }
//             else{
// if(c>n/3)
// ans.add(arr[i]);
// c=1;
//             }
//         }
//         for(int i=0;i<ans.size();i++){
//             System.out.print(ans.get(i)+" ");
//         }

        //Better Solution 2
        //TC:O(N)
        //SC:O(N)
//         Map<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             map.put(arr[i],map.get(arr[i])==null?1:map.get(arr[i])+1);
//         }
//         for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//             if(entry.getValue()>n/3){
// System.out.print(entry.getKey()+" ");
//             }
//         }

        //Optimal Solution
        //TC:O(2N)
        //SC:O(1)
        int c1=0;int el1=0;int c2=0;int el2=0;
        for(int i=0;i<n;i++){
            if((c1==0)&&(arr[i]!=el2)){
                c1=1;
                el1=arr[i];
            }
            else if((c2==0)&&(arr[i]!=el1)){
                c2=1;
                el2=arr[i];
            }
            else if(el1==arr[i]){
                c1=c1+1;
            }
            else if(el2==arr[i]){
                c2=c2+1;
            }
            else{
                c1=c1-1;
                c2=c2-1;
            }
        }
        int c3=0;int c4=0;
        for(int j=0;j<n;j++){
            if(arr[j]==el1){
c3=c3+1;
            }
            else if(arr[j]==el2){
                c4=c4+1;
            }
        }
        if(c3>n/3){
            System.out.print(el1+" ");
        }
        if(c4>n/3)
        System.out.print(el2+" ");
    }
}