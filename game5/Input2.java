package game5;
import java.util.Scanner;

public class Input2 {

  int[] user(){
    Scanner scan = new Scanner(System.in);
		System.out.println("4桁の1～8までの重複しない数字を入力してください");
		System.out.println("4桁の数字入力後 Enter");
		System.out.print("入力してください:");

    //入力時に四桁の数字が重複しないようにチェックを作成　

    return scan.nextInt();
  }
  
  

}
