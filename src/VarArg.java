import java.util.Arrays;

public class VarArg {
    public static void main(String [] args){

        printVarArgs(11,22,33,444,55);
        printVarArgs();

        printStrings("happy","ichigo","yonko");
    }

    static void printVarArgs(int ...z){
        System.out.println(Arrays.toString(z));
    }

    static void printStrings(String ...name){
        System.out.println(Arrays.toString(name));
    }
}
