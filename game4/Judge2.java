package game4;

public class Judge2 {
  String judgement(int com,int user){
    //0 パー
    //1 チョキ 
    //2 グー 

    String judge = "";
    if(com == user){
      judge = "ひきわけ";
    }else if (user == 0){
      if(com == 1) {
        judge = "user:パー com:チョキ userの負け";
      }else{ 
        judge = "user:パー com:グー userの勝ち";
      }
    }else if (user == 1){
      if(com == 2) {
        judge = "user:チョキ com:グー userの負け";
      }else{
        judge = "user:チョキ  com:パー userの勝ち";
      }
    }else if (user == 2){
      if(com == 0) {
        judge = "user:グー com:パー userの負け";
      }else{
        judge = "user:グー com:チョキ  userの勝ち";
      }
    }

    return judge;
  }
}
