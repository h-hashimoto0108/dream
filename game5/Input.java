package game5;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;

public class Input {

  int[] user(int[] nums){
    System.out.println("4桁の1～8までの重複しない数字を入力してください");
    System.out.println("4桁の数字入力後 Enter");
    System.out.print("入力してください:");

    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    List<String> list = Arrays.asList(input.split(""));
    nums = new int[4];
    
    if(!(input.matches("[1-8]{4}") && list.size() == new HashSet<>(list).size())) {
      System.out.println("-------------入力ミス-------------");
      return user(nums);
    }

    for(int i=0;i<nums.length;i++){
      nums[i] = Integer.parseInt(input.substring(i,i+1));
    }

    return nums;
  }
}
