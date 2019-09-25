/*
問題文
左右一列に N枚のタイルが並んでおり、各タイルの初めの色は長さ Nの文字列 
Sで表されます。
左から i番目のタイルは、Sの i番目の文字が 0 のとき黒色で、1 のとき白色で塗られています。
あなたは、いくつかのタイルを黒色または白色に塗り替えることで、どの隣り合う 2枚のタイル
も異なる色で塗られているようにしたいです。
最小で何枚のタイルを塗り替えることで条件を満たすようにできるでしょうか。

制約
1≤|S|≤10^5
Siは 0 または 1 である。
*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String Tile = sc.next();
    char Tiles[]= new char[Tile.length()];
    int count=0;
    for(int i=0;i<Tile.length();i++){
       Tiles[i]=Tile.charAt(i);
    }
    for(int i=1;i<Tile.length();i++){
         if(Tiles[i]==Tiles[i-1]){
           count++;
         if(Tiles[i]=='0'){
         Tiles[i]='1';
         }else if (Tiles[i]=='1'){
         Tiles[i]='0';
         }
    	}
    }
      System.out.print(count); 
  }
}
