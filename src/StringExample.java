import java.util.Scanner;

public class StringExample {
    public static void main(String[] args){
//        String ans = greet();
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String userName = in.next();
        String personalizedMsg = greeting(userName);

        System.out.println(personalizedMsg);
    }

    static String greet(){
        String greeting = "how are you";
        return greeting;
    }

    static String greeting(String name){
        String message = "hello " + name;

        return message;
    }
}
