//Find the Union of two sorted arrays
import java.util.*;
class p9{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
// ArrayList<Integer> arr3=new ArrayList<>();
int arr1[]=new int[n];
int arr2[]=new int[m];
for(int i=0;i<n;i++)
arr1[i]=sc.nextInt();
for(int i=0;i<m;i++)
arr2[i]=sc.nextInt();

//Brute Force Solution
//TC:O(n*m)
//SC(O(n+m))
//My Solution

// boolean flag=true;
// for(int i=0;i<n;i++){
//     flag=true;
//     for(int k=i-1;k>=0;k--){
// if(arr1[i]==arr1[k]){
// flag=false;
// break;
// }
//     }
//     if(flag){
// arr3.add(arr1[i]);
//     }
//     for(int j=0;j<m;j++){
// if(arr1[i]==arr2[j]){
//     arr2[j]=-1;
// }
//     }
    
// }
// for(int l=0;l<m;l++){
//     if(arr2[l]!=-1){
//         arr3.add(arr2[l]);
//     }
// }
// System.out.println("After processing"+arr3.size());
// for(int o=0;o<arr3.size();o++){
//     System.out.print(arr3.get(o));
// }
    // }

//Brute Force Solution
//Striver Solution
//TC:O(n1logn+n2logn)+O(n1+n2)
//SC:O(n1+n2)+O(n1+n2)
// Set<Integer> arr3=new HashSet<>();
// for(int i=0;i<n;i++)
// arr3.add(arr1[i]);

// for(int i=0;i<m;i++)
// arr3.add(arr2[i]);

// Integer union[]=arr3.toArray(new Integer[arr3.size()]);
// for(int j=0;j<union.length;j++)
// System.out.print(union[j]+" ");

//Optimal Solution
//Two Pointer Approach
//TC=O(n+m)
//SC=O(n+m)
//Striver Solution
ArrayList<Integer> union=new ArrayList<>();
int i=0;
int j=0;
while((i<n)&&(j<m)){
    if(arr1[i]<arr2[j]){
        if((union.size()>0)&&(union.get(union.size()-1)==arr1[i])){
            i++;
        }
        else{
            union.add(arr1[i]);
        i++;
        }
    }
    else if(arr2[j]<arr1[i]){
        if((union.size()>0)&&(union.get(union.size()-1)==arr2[j])){
            j++;
        }
        else{
            union.add(arr2[j]);
        j++;
        }
    }
    else{
         if((union.size()>0)&&(union.get(union.size()-1)==arr1[i])){
            i++;
            j++;
        }
        else{
        union.add(arr1[i]);
        i++;
        j++;
        }

    }
}
if(i<n){
while(i<n){
    if(arr1[i]!=(union.get(union.size()-1))){
        union.add(arr1[i]);
        i++;
    }
   } 
}
else if(j<m){
   while(j<m){
    if(arr2[j]!=(union.get(union.size()-1))){
        union.add(arr2[j]);
        j++;
    }
   } 
}
System.out.println("After processing");
for(int k=0;k<union.size();k++)
System.out.print(union.get(k));


}
}