import java.util.Scanner; //Scannerを使用する為のもの

public class P91A3{
  public static void main (String[] str){

    Scanner scan = new Scanner(System.in);  //Scannerインスタンスを作成

    int win  = 0;//勝利数をカウント
    int lose = 0;//敗北数をカウント

    for(int i=0;i<10;i++){//ループ開始　10回ループする

    int result = scan.nextInt();//入力した結果を保存

      if(result == 1){// 1ならwinに1を足す
        win++; 
      }else if(result == 0){// 0ならloseに1を足す　　
        lose++;
      }else{//この問題では不要だが1と0以外の数字が入力された場合 ループ数iを1引いて再入力
        System.out.println("1 or 0を入力してください");
        i--;
        continue;
      }
    
    } // このカッコの外がループの外

    System.out.println("win:"+win+" lose:"+lose); //結果を表示
  }
}

