package game3;

public class Judge2 {
  String judgement(int com,int user){
    //0 pa-
    //1 tyoki
    //2 gu- 

    String judge = "";
    if(com == user){
      judge = "ひきわけ";
    }else if (user == 0){
      if(com == 1) {
        judge = "user:pa- com:tyoki userの負け";
      }else{ 
        judge = "user:pa- com:gu-  userの勝ち";
      }
    }else if (user == 1){
      if(com == 2) {
        judge = "user:tyoki com:gu- userの負け";
      }else{
        judge = "user:tyoki com:pa-  userの勝ち";
      }
    }else if (user == 2){
      if(com == 0) {
        judge = "user:gu- com:pa- userの負け";
      }else{
        judge = "user:gu- com:tyoki  userの勝ち";
      }
    }

    return judge;
  }
}
