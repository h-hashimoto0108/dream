package method;
import java.util.Scanner;

public class P150 {
  public static void main(String[] args) {
    
    int [] array = {13,70,32,47,6,21,55,98};

    Scanner scan = new Scanner(System.in);
    int select = scan.nextInt();

    if(select ==1){
      for(int num: array){
        if(num %2==0){
          System.out.println(num);
        }
      }
    }else if(select == 2){
      for(int num: array){
        if(num %2 !=0){
          System.out.println(num);
        }
      }
      
    }else{
      int sum = 0;
      for(int num: array){
        sum += num;
      }
      System.out.println(sum);
    }

  }
}
