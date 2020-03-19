import java.util.Scanner;
public class P124P16 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int[][] score = new int[2][9];//縦2横9の箱を作る


    //このfor文2つで両チームの得点を入力
    //ここから
    for(int i = 0 ;i<score.length;i++){ //score.lengthで縦長さ2が取得できる
      for(int j = 0 ;j<score[0].length;j++){ //score[0].lengthで縦長さ9が取得できる
        if(i == 0){
          System.out.print("DNAの"+(j+1)+"回の得点入力してください:");
          score[i][j] = scan.nextInt();
        }else{
          System.out.print("bankの"+(j+1)+"回の得点入力してください:");
          score[i][j] = scan.nextInt();
        }
      }
      System.out.println();
    }
    //ここまで


    //上の何回の部分を作成する
    //ここから
    System.out.print(" ／ ");
    for(int j = 0 ;j<score[0].length;j++){
      System.out.print("|"+(j+1)+"|");
    }
    System.out.print("|計|");
    System.out.println();
    //ここまで


    //実際の得点表示を描く
    for(int i = 0 ;i<score.length;i++){
      if(i == 0){
        //DNAの得点を描く
        int dnasum = 0; // DNAの合計得点
        System.out.print(" DNA");
        for(int j = 0 ;j<score[0].length;j++){
          System.out.print(" "+score[i][j]+" "); //DNAの各回の得点を表示
          dnasum = dnasum + score[i][j]; // DNAの合計得点を計算
        }
        System.out.print("  "+dnasum+" "); // DNAの合計得点を表示

      }else{
        //BANKの得点を描く
        int banksum = 0; //BANKの合計得点
        System.out.print("BANK");
        for(int j = 0 ;j<score[0].length;j++){
          System.out.print(" "+score[i][j]+" "); //BANKの各回の得点を表示
          banksum = banksum + score[i][j]; // BANKの合計得点を計算
        }
        System.out.print("  "+banksum+" "); // BANKの合計得点を表示

      }
      System.out.println();
    }

  }
}
