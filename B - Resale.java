/*
問題文
N個の宝石があり、i番目の宝石の価値は Viです。
あなたはこれらの宝石の中からいくつかを選んで手に入れます。
このとき、1つも選ばなくとも、全て選んでも構いません。
ただし、i番目の宝石を手に入れる場合コスト Ciを支払わなければいけません。
手に入れた宝石の価値の合計を X、支払ったコストの合計を Yとします。
X−Yの最大値を求めてください。*/

import java.util.*;
 
public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int Nums1[]=new int[A];
    int Nums2[]=new int[A];
    int count=0;
    int Nums3[]=new int[A];
    for(int i=0;i<A;i++){
          Nums1[i]=sc.nextInt();
        
    }
    for(int i=0;i<A;i++){
          Nums2[i]=sc.nextInt();
        
    }
    for(int i=0;i<A;i++){
    	Nums3[i]=Nums1[i]-Nums2[i];
    }
    for(int i=0;i<A;i++){
    	if(Nums3[i]>0)	
     count+=Nums3[i];
    }
   	System.out.println(count);
  }
}
