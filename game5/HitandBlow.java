package game5;
import java.util.Scanner;
public class HitandBlow {

  HitandBlow(){
		System.out.println("HitandBlow をはじめます");
		System.out.println("ゲーム終了:0"+"つづける:1");
		System.out.print("ゲームをはじめますか？:");
    Scanner scan = new Scanner(System.in);
		System.out.println();
    
      if(scan.nextInt()== 1) {
        System.out.println("game start");
        TreasureNumber t = new  TreasureNumber();
        System.out.println("Treasure Number ?");
        // System.out.println(t.NumberCreate());
         
		    System.out.println();
        HitandBlow game = new HitandBlow();  
      }else{
        System.out.println("game end");
		    System.out.println();
      }

  }

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    HitandBlow game = new HitandBlow();  
	}
}
