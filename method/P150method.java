package method;

public class P150method {
  public static void main(String[] args) {
    
    int [] array = {13,70,32,47,6,21,55,98};
   
    //クラスP150inputのインスタンスを作成する 
    //変数名 inputに作成したインスタンスを代入
    P150input input = new P150input();

    //クラスP150viewのインスタンスを作成する 
    //変数名 viewに作成したインスタンスを代入
    P150view view = new P150view();

    //右側のinput.Getinput()から実行されて
    //処理がP150inputの6~12行目が実行される
    //returnしたinputがkeyinputに代入される
    int keyinput = input.Getinput();

    //keyinputの値によって処理が分岐する
    if(keyinput ==1){
      //P150viewのインスタンスであるviewからViewEvenを実行する
      //P150viewの4~12行目が実行される
      view.ViewEven(array);
    }else if(keyinput ==2){
      //P150viewのインスタンスであるviewからViewOddを実行する
      //P150viewの14~22行目が実行される
      view.ViewOdd(array);
    }else{
      //P150viewのインスタンスであるviewからViewSumを実行する
      //P150viewの24~30行目が実行される
      view.ViewSum(array);
    }
    
  }
}
