import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++){
           if (isArmStrong(i)){
               System.out.println(i + " ");
            };
        }
    }

    static boolean isArmStrong(int num) {
        int oldNum = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum += cube;
            num /= 10;
        }
        return sum == oldNum;
    }

}
