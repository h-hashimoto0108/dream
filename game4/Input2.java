package game4;
import java.util.Random;
import java.util.Scanner;
public class Input2 {
  int computer(){
		Random r = new Random(); 
    return r.nextInt(2);
  }

  int user(){
    Scanner scan = new Scanner(System.in);
		System.out.println("\n0;パー\n1:チョキ\n2:グー");
		System.out.print("入力してください:");
    return scan.nextInt();
  }
}
