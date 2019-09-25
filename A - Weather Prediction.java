/*高橋君の住む町の天気は、一日ごとに晴れ(Sunny)、くもり(Cloudy)、雨(Rainy)、晴れ、くもり、雨、… と周期的に変化します。

今日の天気を表す文字列 Sが与えられるので、明日の天気を予測してください。
〇制約
S は Sunny, Cloudy, Rainy のいずれかである */

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    if(N.equals("Sunny")){
    	System.out.println("Cloudy");
    }else if(N.equals("Cloudy")){
    	System.out.println("Rainy");
    }else{
    	System.out.println("Sunny");
    }
  }
}
