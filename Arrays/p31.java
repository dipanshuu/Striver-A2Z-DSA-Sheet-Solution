//Pascal Triangle
import java.util.*;
class p31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();

        //Brute Force Solution
        //TC:O(N2)
        //SC:O(2N)
       ArrayList<Integer> tri1=new ArrayList<>();
       ArrayList<Integer> tri2=new ArrayList<>();
       tri1.add(1);
       tri1.add(1);
        System.out.print(1+" ");
        System.out.println();
        for(int i=0;i<tri1.size();i++){
            System.out.print(tri1.get(i)+" ");
        }
        System.out.println();
       for(int i=3;i<=r;i++){
        for(int j=0;j<i;j++){
            if((j==0)||(j==i-1)){
                tri2.add(1);
                System.out.print(1+" ");
            }
            else{
                for(int k=j-1;k<j;k++){
                    tri2.add(tri1.get(k)+tri1.get(k+1));
                    System.out.print(tri1.get(k)+tri1.get(k+1)+" ");
                }
            }
        }
        tri1.clear();
        for(int l=0;l<tri2.size();l++){
            tri1.add(tri2.get(l));
        }
        tri2.clear();
       System.out.println();
       }
    //    System.out.println("The value at "+r+" row"+c+" column "+tri1.get(c-1));  
//        for(int i=0;i<tri1.size();i++){
// System.out.print(tri1.get(i)+" ");
//        }

       //Better Solution
       //TC:O(R2+R)
       //SC:O(R)
    //    ArrayList<Long> ans=new ArrayList<>();
    //     for(int i=1;i<=r;i++){
    //         ans.add(nCr(r-1,i-1));
    //     }
    //     for(int i=0;i<ans.size();i++){
    //         System.out.print(ans.get(i)+" ");
    //     }

        //Optimal Solution
        //TC:O(2R)
        //SC:O(R)
// ArrayList<Long> ans=new ArrayList<>();
// ans.add((long)1);long res=1;
//         for(int i=1;i<r;i++){
//             res=(res*(r-i))/i;
//             ans.add(res);
//         }
//  for(int i=0;i<ans.size();i++){
//             System.out.print(ans.get(i)+" ");
//         }
// }
// static long nCr(int n,int r){
//         long res=1;
//         for(int i=0;i<r;i++){
//             res=res*(n-i)/(i+1);
//         }
//         return res;
    }

    }
    

