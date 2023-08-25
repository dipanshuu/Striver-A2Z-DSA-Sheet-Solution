//Print the matrix in spiral manner
import java.util.*;
class p29{
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

        //Optimal Solution
        //TC:O(N*M))
        //SC:O(1)
        //All Test Cases Not Passed
        for(int i=0;i<m/2;i++){
        for(int j=i;j<n-i;j++){
            System.out.print(arr[i][j]+" ");
        }
        int col=n-i-1;
        int row=i+1;
        for(int k=row;k<m-i;k++){
            System.out.print(arr[k][col]+" ");
        }
        col=col-1;
        int nrow=m-i-1;
        for(int k=col;k>=i;k--){
            System.out.print(arr[nrow][k]+" ");
        }
        for(int l=nrow-1;l>=i+1;l--){
            System.out.print(arr[l][i]+" ");
        }
        }       
    }
}