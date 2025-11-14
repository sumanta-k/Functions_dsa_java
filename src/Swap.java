public class Swap {
    public static void main(String[] args){

        int a = 10;
        int b = 20;


       swap(a,b) ;

        System.out.println(a + " " + b);


        String name = "Happy";
        changeName(name);
        System.out.println(name);

    }
    static void swap(int a, int b){
        int temp;
        temp = a;
        a = b; /* a == b's value internally */
        b = temp; /* b == a's value internall */
        /* but they are only pass value not the references */
    }

    static void changeName(String name){
        name = "Kunal Kushwaha";
    }
}
