package game3;
import java.util.Scanner;
public class Janken {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("じゃんけんしましよう");
		System.out.println("ゲーム終了:0"+"つづける:1");

    Scanner scan = new Scanner(System.in);

    while(true){
      if(scan.nextInt()== 1) {
        System.out.println("game start");
        Input2 in = new Input2();
        Judge2 judge = new Judge2();   
        System.out.println(judge.judgement(in.computer(),in.user()));   
      }else{
        System.out.println("game end");
        break;
      }

      System.out.println("じゃんけんしましよう");
      System.out.println("ゲーム終了:0"+"つづける:1");
    }
	}
}
