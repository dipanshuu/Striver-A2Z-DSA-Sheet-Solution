//Majority Element(>n/2 times)
import java.util.*;
class p17{
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

//Brute Force Solution
//TC:O(N2)
//SC:O(1)
//MS
// boolean flag=false;
// int maxC=0;int count=0;int ans=0;
// for(int i=0;i<n;i++){
//     flag=false;count=0;
//         for(int j=0;j<i;j++){
//         if(arr[i]==arr[j]){
//             flag=true;
//             break;
//         }
//     }
//     if(flag)
//     continue;
//     else{
//         for(int k=0;k<n;k++){
//             if(arr[i]==arr[k])
//             count=count+1;
//         }
//         if(maxC<count){
//             maxC=count;
// ans=arr[i];
//         }
//     }
// }
// if(maxC>(n/2)){
//     System.out.println("Majority element is "+ans);
// }
// else{
//     System.out.println("No Majority Element");
// }

//Better Solution
//TC:O(N)
//SC:O(N)
//MS
// Map<Integer,Integer> mp=new HashMap<>();
// for(int i=0;i<n;i++){
// if(!mp.containsKey(arr[i])){
// mp.put(arr[i],1);
//     }
//     else{
// mp.put(arr[i],mp.get(arr[i])+1);
//     }
// }
// boolean flag=false;
// for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
//     if(entry.getValue()>(n/2)){
//         flag=true;
//         System.out.println("Majority Element is "+entry.getKey());
//     }
// }
// if(flag==false){
//     System.out.println(-1);
// }

//Optimal Solution
//Moore's Voting Algorithm
//TC:O(2N)
//SC:O(1)
//MS
int el=arr[0];
int c=1;int count=0;
for(int i=1;i<n;i++){
    if(arr[i]==el){
        c=c+1;
    }
    else if(arr[i]!=el){
        c=c-1;
    }
    if(c==0){
        el=arr[i+1];
        c=0;
    }
}
if(c!=0){
    for(int i=0;i<n;i++){
        if(arr[i]==el){
count=count+1;
        }
    }
}
if(count>(n/2)){
    System.out.println("Majority Element "+el);
}
else{
    System.out.println(-1);
}
}
}