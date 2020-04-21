package game5;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class TreasureNumber {
  int[] Treasure;

  int[] NumberCreate(){
    this.Treasure = new int[4];
    ArrayList<Integer> list = new ArrayList<Integer>();

    for(int i = 1 ; i <= 8 ; i++) {
      list.add(i);
    }

    Collections.shuffle(list);

    for(int i = 0 ; i < 4 ; i++) {
      Treasure[i] = list.get(i);
    }

    return Treasure;
  }
}
