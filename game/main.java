package game;

public class main{
     public static void main(String[] args){
            System.out.println("Hello World!!");

            input in = new input(); 


            // System.out.println("変化前 "+in.input_num);

            System.out.println(in.getInt());

            in.setInt(100);

            System.out.println(in.getInt());
               }
}
