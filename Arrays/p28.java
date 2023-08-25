//Rotate Matrix by 90 degrees
import java.util.*;
class p28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[][]=new int[n][n];
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            arr[i][j]=sc.nextInt();
        }
      }

      //Brute Force Solution
      //TC:O(2N2)
      //SC:O(N2)
    //   int ans[][]=new int[n][n];
    //   int col=n-1;
    //   for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         ans[j][col]=arr[i][j];
    //     }
    //     col=col-1;
    //   }
    //   for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         System.out.print(ans[i][j]+" ");
    //     }
    //     System.out.println();
    //   }

      //Optimal Solution
      //TC:O(N2+N2+N2)
      //SC:O(1)
      for(int i=0;i<n;i++){
        for(int j=0;j<i;j++){
            int t=arr[j][i];
            arr[j][i]=arr[i][j];
            arr[i][j]=t;
        }
      }
      int z=n-1;
      for(int i=0;i<n;i++){
        z=n-1;
        for(int j=0;j<n/2;j++){
            int t=arr[i][j];
            arr[i][j]=arr[i][z];
            arr[i][z]=t;
            z=z-1;
        }
      }
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }  
    }
}