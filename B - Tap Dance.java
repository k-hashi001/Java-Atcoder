/*高橋君はタップダンスをすることにしました。タップダンスの動きは文字列 
Sで表され、Sの各文字は L, R, U, D のいずれかです。各文字は足を置く位置を表しており、
1文字目から順番に踏んでいきます。Sが以下の2条件を満たすとき、またその時に限り、Sを
「踏みやすい」文字列といいます。

奇数文字目がすべて R, U, D のいずれか。
偶数文字目がすべて L, U, D のいずれか。
Sが「踏みやすい」文字列なら Yes を、そうでなければ No を出力してください。

〇制約
Sは長さ 
1以上 100 以下の文字列
Sの各文字は L, R, U, D のいずれか*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    char Taps[]=new char[N.length()];
    boolean M=false;
    
    for(int i=0;i<N.length();i++){
    	Taps[i]=N.charAt(i);
    }
   for(int i=0;i<N.length();i++){
     	if(i%2==0){
        	if(Taps[i]=='L'){
            	M=true;
             	 break;
            }
        }else{
        	if(Taps[i]=='R'){
            	M=true;
             	 break;
        	}
        }
    }
    if(M==true){
    	System.out.println("No");
    }else{
    	System.out.println("Yes");
    }
  }
}

