package method2;
import java.util.Random;

public class P151input {


  int getRandamNum(){

    Random r = new Random();
    int i = r.nextInt(5);

    return i;
  }

   int[] getArray(int x){

    int[] numArr = new int[x];

    Random r = new Random();

    for (int i = 0;i<numArr.length;i++){
      numArr[i] = r.nextInt(99);
    }

     return numArr;
   }
    


}
