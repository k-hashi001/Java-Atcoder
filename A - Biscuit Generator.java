/* 問題文

ビスケット生産装置を起動すると、起動してから 
A秒後、2A秒後、3A秒後、... (Aの倍数秒後) に B枚ずつビスケットを生産します。
ビスケット生産装置を起動してから T+0.5秒後までに生産されるビスケットの合計
枚数を求めてください。

制約
入力は全て整数である。
1≤A,B,T≤20    */

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int count=0;
    for(int i=1;i<C+1;i++){
    	if(i%A==0){
        count++;
        }
    }
    count *=B;
   System.out.println(count);
  }
}
