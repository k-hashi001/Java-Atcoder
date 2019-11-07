/*
N匹のスライムが横一列に並んでいます。これらの色に関する情報が、長さ 
Nの英小文字から成る文字列 Sで与えられます。左から i 番目のスライムは、 
Sの i文字目に対応する色を持っています。
同じ色を持ち隣接するスライムは融合し、色は変わらずに 1匹のスライムと
なります。このとき、融合した後のスライムは、融合する前の各スライムが
隣接していた他のスライムと隣接した状態になります。
最終的に存在するスライムは何匹となるでしょうか。

入力例 1 
10
aabbbbaaca

出力例 1 
5
*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    String str =sc.next();
    char chr[]=new char[str.length()];
    int count=1;
    for(int i=0;i<str.length();i++){
      chr[i]=str.charAt(i);
    }
    for(int j=1;j<chr.length;j++){
      if(chr[j-1]!=chr[j]){
      	count++;
      }	
    }
    System.out.print(count);
  }
}
