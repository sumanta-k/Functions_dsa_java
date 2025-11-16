public class MethodOverloading {
    public static void main(String[] args) {
//        fun("happy");
//        fun(55);
        sum(2,3);
        sum(3,3,3);
    }
    static int sum(int a , int b){
        return a + b;
    }
    static int sum(int a , int b, int c){
        return a + b + c;
    }
    static void fun(String name){
        System.out.println(name);
    }

    static void fun(int num){
        System.out.println(num);
    }
}
