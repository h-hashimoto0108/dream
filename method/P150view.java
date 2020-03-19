package method;

public class P150view {
  void ViewEven(int [] array){

    for(int num: array){
      if(num %2==0){
        System.out.println(num);
      }
    }

  } 

  void ViewOdd(int [] array){

    for(int num: array){
      if(num %2!=0){
        System.out.println(num);
      }
    }

  } 

  void ViewSum(int [] array){
    int sum = 0;
    for(int num: array){
      sum += num;
    }
    System.out.println(sum);
  } 

}
