package game3;
import java.util.Random;
import java.util.Scanner;
public class Input2 {
  int computer(){
		Random r = new Random(); 
    int i =  r.nextInt(2);
    System.out.println(i + "com");
    return i;
  }

  int user(){
    Scanner scan = new Scanner(System.in);
    return scan.nextInt();
  }
}
