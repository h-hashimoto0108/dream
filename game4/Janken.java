package game4;
import java.util.Scanner;
public class Janken {

  Janken(){
		System.out.println("じゃんけんしましよう");
		System.out.println("ゲーム終了:0"+"つづける:1");
		System.out.print("ゲームをはじめますか？:");
    Scanner scan = new Scanner(System.in);
    
      if(scan.nextInt()== 1) {
        System.out.println("game start");
        Input2 in = new Input2();
        Judge2 judge = new Judge2();   
        System.out.println(judge.judgement(in.computer(),in.user()));   
        Janken game = new Janken();
      }else{
        System.out.println("game end");
      }

  }

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
    Janken game = new Janken();  
	}
}
