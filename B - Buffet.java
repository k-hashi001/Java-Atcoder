/*高橋くんは 
N種類の料理が食べ放題のビュッフェに行き、全種類の料理 (料理1, 料理 2, …, 料理 N) を 1度ずつ食べました。
高橋くんが i(1≤i≤N)番目に食べた料理は料理 Aiでした。高橋くんは、料理 i(1≤i≤N)を食べると満足度 Biを得ま
す。また、料理 i(1≤i≤N−1)を食べた直後に料理 i+1を食べると満足度 Ciを追加で得ます。
高橋くんが得た満足度の合計を求めてください。*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum=0;
    int A[]=new int[N];
    int B[]=new int[N];
    int C[]=new int[N-1];
    for(int i=0;i<N;i++){
     A[i]=sc.nextInt();
     }
    for(int i=0;i<N;i++){
     B[i]=sc.nextInt();
     }
    for(int i=0;i<N-1;i++){
      C[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
      if(i>0){
      if(A[i]-A[i-1]==1){
      	sum+=B[A[i]-1]+C[A[i]-2];
       }else{
        sum+=B[A[i]-1];
      }
      }else{
        sum+=B[A[i]-1];
      }
    } System.out.println(sum);
  }
}
