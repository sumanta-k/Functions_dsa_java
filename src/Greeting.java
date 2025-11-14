import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        greet();
    }

    static void  greet(){
        System.out.print("Enter your User Name : ");
      Scanner in = new Scanner(System.in);
      String userName = in.next();

      System.out.println("Hello "+ userName + ", How are you ?");
    }
}
