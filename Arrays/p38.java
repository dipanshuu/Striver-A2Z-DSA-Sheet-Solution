//Find the Missing and Repeating Number
import java.util.*;
class p38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();

        //Brute Force Solution
        //TC:O(N2)
        //SC:O(2)
//         ArrayList<Integer> ans=new ArrayList<>();
//         int freq=0;int r=0;int m=0;
//         for(int i=1;i<=n;i++){
//             freq=0;
//             for(int j=0;j<n;j++){
//                 if(i==arr[j])
//                 freq=freq+1;
//             }
//             if(freq==2){
// r=i;
//             }
//             else if(freq==0){
// m=i;
//             }
//         }
//         ans.add(r);
//         ans.add(m);
//         for(int i=0;i<2;i++)
//         System.out.print(ans.get(i)+" ");

//Better Solution
//TC:O(2N)
//SC:O(N)
// int r=0;int m=0;
// ArrayList<Integer> ans=new ArrayList<>();
// int count[]=new int[n+1];
// for(int i=0;i<n;i++){
//     count[arr[i]]++;
// }
// for(int i=1;i<n+1;i++){
//     if(count[i]==2){
//         r=i;
//     }
//     else if(count[i]==0)
//     m=i;
// }
// ans.add(r);
// ans.add(m);
// for(int i=0;i<2;i++)
// System.out.print(ans.get(i)+" ");

//Optimal Solution 1
//TC:O(N)
//SC:O(1)
//All test cases not passed
// int sn=n*(n+1)/2;int s=0;
// int s2=0;
// for(int i=0;i<n;i++)
// {
//     s=s+arr[i];
//     s2=s2+arr[i]*arr[i];
// }
// int ans1=s-sn;
// int s2n=(n*(n+1)*(2*n+1))/6;
// int ans2=s2-s2n;
// int ans3=ans2/ans1;
// int ans4=(ans1+ans3)/2;
// int ans5=(ans3-ans4);
// System.out.println("Repeating Number is "+ans4);
// System.out.print("Missing Number is "+ans5);

//Optimal Solution 2
//TC:O(4N)
//SC:O(1)
int xr=0;
for(int i=0;i<n;i++){
    xr=xr^arr[i];
    xr=xr^(i+1);
}
// int bitNo=0;
// while(true){
//     if((xr&1<<bitNo)!=0)
//     break;
//     bitNo++;
// }
int bitNo=(xr & ~(xr-1));
int zero=0;
int one=0;
for(int i=0;i<n;i++){
    if((arr[i]&bitNo)!=0){
        one=one^arr[i];
    }
    else{
        zero=zero^arr[i];
    }
}
for(int i=1;i<=n;i++){
    if((i&bitNo)!=0){
        one=one^i;
    }
    else{
        zero=zero^i;
    }
}
int count=0;
for(int i=0;i<n;i++){
    if(arr[i]==zero)
    count=count+1;
}
if(count==0){
    System.out.println("Repeating Number is "+one); 
    System.out.println("Missing Number is "+zero);
}
else if(count==2){
System.out.println("Repeating Number is "+zero); 
System.out.println("Missing Number is "+one); 
}
    }
}