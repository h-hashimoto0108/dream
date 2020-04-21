package game5;
import java.util.Scanner;
public class HitandBlow {

  HitandBlow(){
    int[] TreasureNums;

    System.out.println("HitandBlow をはじめます");
    System.out.println("ゲーム終了:0"+"つづける:1");
    System.out.print("ゲームをはじめますか？:");
    Scanner scan = new Scanner(System.in);

    if(scan.nextInt()== 1) {
      System.out.println("game start");
      TreasureNumber t = new TreasureNumber();
      TreasureNums = t.NumberCreate();
      Input in = new Input();

      HitandBlow game = new HitandBlow(in,TreasureNums,1);
    }else{
      System.out.println("game end");
    }
  }

  HitandBlow(Input in,int[] TreasureNums,int gameCount) {
      System.out.println("gameCount:"+gameCount);
      int[] inputNums = in.user(new int[4]);
      SearchTreasure s = new SearchTreasure();
      
      if(gameCount ==10){
        System.out.println("game over");
      }else if(s.HitSearch(inputNums,TreasureNums) == 4) {
        System.out.println("game clear");
      }else{
        System.out.println("hit :"+s.HitSearch(inputNums,TreasureNums));
        System.out.println("blow:"+(s.BlowSearch(inputNums,TreasureNums) - s.HitSearch(inputNums,TreasureNums)));
        System.out.println("----------------------------------");

        gameCount++;
        HitandBlow game = new HitandBlow(in,TreasureNums,gameCount);
      }
  }

  public static void main(String[] args) {
    // TODO 自動生成されたメソッド・スタブ
    HitandBlow game = new HitandBlow();  
  }
}
