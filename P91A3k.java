import java.util.Scanner; //Scannerを使用する為のもの

public class P91A3k{
  public static void main (String[] str){
    Scanner scan = new Scanner(System.in);//値を入力する特別な箱

    int kati=0;//勝ち数の箱
    int make=0;//負け数の箱
    int count1=0;//勝利数の箱
    int count2 =0;//敗戦数の箱
    System.out.println("数値を入力して下さい");

    for (int i =1; i<11; i++) {//iが１１より小さい場合１１までカウントする

      int x = scan.nextInt();
      System.out.println(i+"試合目です。");
      kati=x;   
      if (kati ==1) {
        //count1=i; // iをcount1に入れてしまうと今までの勝利数がリセットされてしまう
        count1++;   // 勝つたびに数字を1たすことが必要

        System.out.println(kati+"この試合は勝ちです。");
        System.out.println("勝利数は"+count1+"です。");

      }

      make =x; 
      if (make==0) {
        //count2=i;// iをcount2に入れてしまうと今までの敗北数がリセットされてしまう
        count2++;   // 負けるたびに数字を1たすことが必要

        System.out.println(make+"この試合は負けです。" );
        System.out.println("敗戦数は"+count2+"です。");

        // }else {
        // System.out.println("入力した数値は無効です。" );
        //
        // }
      }
     }
  }  
}
