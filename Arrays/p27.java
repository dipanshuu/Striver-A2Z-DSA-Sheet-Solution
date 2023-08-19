//Set Matrix Zeros
import java.util.*;
class p27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println();
        }

//Brute Force Solution
//TC:O(3N2+N+N)
//SC:O(N2)
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         if(arr[i][j]==0)
//         arr[i][j]=-1;
//     }
// }
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         if(arr[i][j]==-1){
//             for(int k=0;k<n;k++){
//                 if(k!=j){
//                     arr[i][k]=0;
//                 }
//             }
//             for(int l=0;l<m;l++){
//                 if(l!=i){
//                     arr[l][j]=0;
//                 }
//             }
//         }
//     }
// }
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         if(arr[i][j]==-1)
//         arr[i][j]=0;
//     }
// }
// for(int i=0;i<n;i++){
//     for(int j=0;j<n;j++){
//         System.out.print(arr[i][j]+" ");
//     }
//     System.out.println();
// }

//Better Solution
//TC:O(3MN+M+N)
//SC:O(M+N)
// int row[]=new int[m];
// int col[]=new int[n];int k=-1;
// int min=1;
// for(int i=0;i<m;i++){
//     k=-1;min=1;
//     for(int j=0;j<n;j++){
//         if(min>arr[i][j]){
//             min=arr[i][j];
//             k=j;
//         }
//     }
//     if(min==1){
//         row[i]=1;
//     }
//     else if(min==0){
//         row[i]=0;
//     }
// }
// min=1;
// for(int j=0;j<n;j++){
//     k=-1;min=1;
//     for(int i=0;i<m;i++){
//         if(min>arr[i][j]){
//             min=arr[i][j];
//             k=i;
//         }
//     }
//     if(min==1){
//         col[j]=1;
//     }
//     else if(min==0){
//         col[j]=0;
//     }

// }
// for(int i=0;i<row.length;i++){
//     if(row[i]==0){
//         for(int j=0;j<n;j++)
//         arr[i][j]=0;
//     }
// }
// for(int j=0;j<col.length;j++){
//     if(col[j]==0){
//         for(int i=0;i<m;i++)
//         arr[i][j]=0;
//     }
// }
// for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//         System.out.print(arr[i][j]+" ");
//     }
//     System.out.println();
// }

//Optimal Solution
int min=1;
for(int i=0;i<m;i++){
    min=1;
    for(int j=0;j<n;j++){
        if(min>arr[i][j]){
            min=arr[i][j];
        }
    }
    if(min==1){
        arr[i][0]=1;
    }
    else if(min==0){
        arr[i][0]=-1;
    }
}
min=1;
for(int j=0;j<n;j++){
    min=1;
    for(int i=0;i<m;i++){
        if(min>arr[i][j]){
            min=arr[i][j];
        }
    }
    if(min==1){
        arr[0][j]=1;
    }
    else if(min==0){
        arr[0][j]=-1;
    }

}
for(int i=0;i<m;i++){
    if(arr[i][0]==-1){
        for(int j=0;j<n;j++)
        arr[i][j]=0;
    }
}
for(int j=0;j<n;j++){
    if(arr[0][j]==-1){
        for(int i=0;i<m;i++)
        arr[i][j]=0;
    }
}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(arr[i][j]==-1)
        arr[i][j]=0;
        System.out.print(arr[i][j]+" ");
    }
    System.out.println();
}
    }
}