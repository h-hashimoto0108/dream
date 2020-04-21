package game5;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SearchTreasure {
  int HitSearch(int[] inputNums, int[] TreasureNums) {
    int hit = 0;
    for (int i=0;i<inputNums.length;i++){
     if (inputNums[i] == TreasureNums[i]) {
       hit++;
     } 
    }   
    return hit; 
  }

  int BlowSearch(int[] inputNums, int[] TreasureNums){
    int  blow = 0;
    for (int inputNum : inputNums) {
      for(int TreasureNum: TreasureNums){
        if(inputNum==TreasureNum){
          blow++;
        }
      }
    }   
    return blow;
  }
}
