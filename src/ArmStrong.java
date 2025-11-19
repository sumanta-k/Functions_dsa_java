import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        boolean ans = isArmStrong();
        System.out.println(ans);
    }

    static boolean isArmStrong() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for armstrong ");
        int num = in.nextInt();
        int oldNum = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum += cube;
            num /= 10;
        }
        System.out.println(sum);
        return sum == oldNum;
    }

}
