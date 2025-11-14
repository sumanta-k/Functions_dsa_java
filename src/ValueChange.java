import java.util.Arrays;

public class ValueChange {
    public static void main(String [] args){
        int [] arr = { 11, 22 ,33 ,44 ,55};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void changeArr(int [] arr){
       arr[0] = 99;
    }
}
