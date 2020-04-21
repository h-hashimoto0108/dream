package method2;

public class P151main {
  public static void main(String[] args) {


    /*
    
    各ファイルごとの動作
    P151main 
    -------------------------------------------------------------------
    P151inputとP151viewのインスタンスをつくり、それぞれのメソッドを実行 
    -------------------------------------------------------------------

    P151input
    -------------------------------------------------------------------
    getRandamNum()
    配列の数を決める乱数1を発生させて発生させた乱数1を返す

    getArray()
       
    -------------------------------------------------------------------
    -------------------------------------------------------------------

    P151view
    -------------------------------------------------------------------
    -------------------------------------------------------------------

    */ 

      P151input input = new P151input();
      P151view view = new P151view();


      System.out.println("一回め");
      int numRandam = input.getRandamNum();
      int[] numArr =  input.getArray(numRandam);
      view.numArrView(numArr);

      System.out.println("二回め");


      //11,12,13行目を一行で書く書き方
      //どちらが優れてるというわけではないですが理解の一助になればと思います
      view.numArrView(input.getArray(input.getRandamNum()));

      
  }
}
