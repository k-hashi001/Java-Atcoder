/*問題文
高橋君は早押しクイズの大会を開くことにしました。スコアボードの作成を任されたキザハシ君は、次の
ルールを持つラウンドのポイントを管理するプログラムを書くのに苦戦しています。
このラウンドの参加者は N人であり、1からNまでの番号がついています。ラウンド開始時点では全員が K
ポイントを持っています。
誰かが問題に正解すると、その人以外のN−1人のポイントが 1減ります。これ以外によるポイントの変動は
ありません。

ラウンド終了時にポイントが 0 以下の参加者は敗退し、残りの参加者が勝ち抜けます。
このラウンドでは Q回の正解が出て、i番目に正解したのは参加者 Aiでした。 キザハシ君の代わりに、N
人の参加者のそれぞれが勝ち抜けたか敗退したかを求めるプログラムを作成してください。

入力
入力は以下の形式で標準入力から与えられます。

N K Q

A1
A2
.
.
.
AQ   */


import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int Member = sc.nextInt();
    int Point =  sc.nextInt();
    int Times = sc.nextInt();
    int Answers[] = new int[Times];
    int Member_Point[]=new int[Member];
    
    for(int i=0;i<Member;i++){
    	Member_Point[i]=Point-Times;
    }
    for(int i=0;i<Times;i++){
        Answers[i]=sc.nextInt();
    }
    for(int i=0;i<Times;i++){
        Member_Point[Answers[i]-1]+=1;
    }
   for(int i=0;i<Member;i++){
    	if(Member_Point[i]<=0){
      	System.out.println("No");
        }else{
        	System.out.println("Yes");
        } 
    }
  }
}
