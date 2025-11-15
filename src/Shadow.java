public class Shadow {
    static int x = 10;
    public static void main(String[] args){
       System.out.println(x) ; // 10
       int x = 30;
        System.out.println(x); // 30
        Print(); // 10

    }
    static void Print(){
        System.out.println(x); // 10
    }
}
