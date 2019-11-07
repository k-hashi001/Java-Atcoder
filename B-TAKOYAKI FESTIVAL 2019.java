/*
たこ焼きフェスティバル (たこフェス) の季節がやってきました！
今年のたこフェスでは N個のたこ焼きがふるまわれる予定です。このうち i個目のたこ焼きのおいしさは 
diです。ところで、おいしさが xと yであるたこ焼きを一緒に食べると、体力が x × y回復することが一般
に知られています。
たこフェスでふるまわれる N個のたこ焼きから、2個を選ぶ方法は N ×(N−1)/2
通り考えられます。そのそれぞれについて、一緒に食べたときの体力の回復量を求めて、その総和を出力してください。
*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int Nums[]=new int[A];
    int sum=0;
    for(int i=0;i<A;i++){
    	Nums[i]=sc.nextInt();
    }
    for(int i=0;i<A;i++){
      for(int j=0;j<A;j++){
        if(j>i){
        	sum+=Nums[j]*Nums[i];
        }
      }
    }
    System.out.print(sum);
  }
}
