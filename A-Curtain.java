/*高橋君の家の窓の横方向の長さは Aであり、横方向の長さが Bのカーテンが 2
枚取り付けられています。(カーテンは縦方向には窓を覆うのに十分な長さがあります。)
窓のうちカーテンで隠されていない部分の横方向の長さが最小になるようにカーテンを
閉めます。 このとき、窓のカーテンで隠されていない部分の合計の横方向の長さを求めてください。*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int total =B*2;
    if(B>=A){
    	System.out.println(0);
    }else if(A<=total){
    	System.out.println(0);
    }else{
    	System.out.println(A-total);
    }
  }
}
