/*
高橋君は 3桁のパスワードを設定しようとしています。
使える文字が 1以上 N以下の数字のみであるとき、設定できるパスワードが
全部で何種類であるかを答えてください。

制約

1≤N≤9
Nは整数である。*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    double result = Math.pow(N, 3);
   
    System.out.println((int)result);
  }
}
