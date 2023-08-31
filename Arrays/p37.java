//Merge 2 sorted arrays without extra space
import java.util.*;
class p37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];
        for(int i=0;i<n1;i++)
        arr1[i]=sc.nextInt();
        for(int i=0;i<n2;i++)
        arr2[i]=sc.nextInt();
        
//Brute Force Solution
//TC:O(N1+N2)
//SC:O(N1+N2)
// int arr3[]=new int[n1+n2];
// int i=0;int j=0;int k=0;
// while((i<n1)&&(i<n2)){
// if(arr1[i]<arr2[j]){
//     arr3[k]=arr1[i];
//     i++;
//     k++;
// }
// else if(arr1[i]>arr2[j]){
//     arr3[k]=arr2[j];
//     k++;
//     j++;
// }
// }
// if(n1<n2){
//     while(j<n2){
//         arr3[k]=arr2[j];
//         k++;
//         j++;
//     }
// }
// else if(n2<n1){
// while(i<n1){
//     arr3[k]=arr2[i];
//     i++;
//     k++;
// }
// }
// int m=0;
// for(int l=0;l<n1;l++){
//     arr1[l]=arr3[m];
//     m=m+1;
// }
// for(int n=0;n<n2;n++){
//     arr2[n]=arr3[m];
//     m=m+1;
// }
// System.out.println("After processing");
// for(int o=0;o<arr1.length;o++)
// System.out.print(arr1[o]+" ");
// for(int p=0;p<arr2.length;p++)
// System.out.print(arr2[p]+" ");

        //Better Solution
        //TC:O(N1*N2+N2logN2)
        //SC:O(1)
        // for(int i=0;i<n1;i++){
        // for(int j=0;j<n2;j++){
        //     if(arr2[j]<arr1[i]){
        //         int t=arr1[i];
        //         arr1[i]=arr2[j];
        //         arr2[j]=t;
        //         break;
        //     }
        // }
        // Arrays.sort(arr2);
        //     }
        //     for(int i=0;i<n1;i++){
        //         System.out.print(arr1[i]+" ");
        //     }
        //     for(int j=0;j<n2;j++){
        //         System.out.print(arr2[j]+" ");
        //     }

        //Optimal Solution 1
        //TC:O(Math.min(N1,N2)+N1logN1+N2logN2)
        //SC:O(1)
        // int l=n1-1;
        // int r=0;
        // while((l>=0)&&(r<n2)&&(arr1[l]>arr2[r])){
        //     int t=arr1[l];
        //     arr1[l]=arr2[r];
        //     arr2[r]=t;
        //     l--;
        //     r++;
        // }
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        // System.out.println("After processing");
        // for(int i=0;i<arr1.length;i++)
        // System.out.print(arr1[i]+" ");
        // for(int j=0;j<arr2.length;j++)
        // System.out.print(arr2[j]+" ");

        //Optimal Solution 2
        //TC:O(log(N1+N2)*(N1+N2))
        //SC:O(1)
        int gap=(int)Math.ceil((n1+n2)/2);
        int left=0;int right=gap;
        while(gap>0){
            left=0;right=gap;
            while(right<(n1+n2)){
            if((left<n1)&&(right>=n1)){
if(arr1[left]>arr2[right-n1]){
    int t=arr1[left];
arr1[left]=arr2[right-n1];
arr2[right-n1]=t;
}
left++;
right++;
}
            else if(left>=n1){
if(arr2[left-n1]>arr2[right-n1]){
    int t=arr2[left-n1];
arr2[left-n1]=arr2[right-n1];
arr2[right-n1]=t;
}
left++;
right++;
            }
            else{
              if(arr1[left]>arr1[right]){
                int t=arr1[left];
arr1[left]=arr1[right];
arr1[right]=t;
              }
left++;
right++;  
            }
            }
            if(gap==1)
            break;
            gap=(int)Math.ceil(gap/2);
        }
        System.out.println("After processing");
        for(int i=0;i<arr1.length;i++)
        System.out.print(arr1[i]+" ");
        for(int j=0;j<arr2.length;j++)
        System.out.print(arr2[j]+" ");
        }
    }
