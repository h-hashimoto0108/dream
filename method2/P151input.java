package method2;
import java.util.Random;

public class P151input {
  


  //乱数を発生させて値を返す
  int getRandamNum(){

    Random r = new Random();
    int i = r.nextInt(5);

    return i;
  }

   //発生させた乱数を受けとり
   int[] getArray(int x){

    int[] numArr = new int[x];

    Random r = new Random();

    for (int i = 0;i<numArr.length;i++){
      numArr[i] = r.nextInt(99);
    }

     return numArr;
   }
    


}
