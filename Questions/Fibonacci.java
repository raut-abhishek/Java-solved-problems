public class Fibonacci {

    static void getFibonacci(int num){
        int a = 0, b = 1;
        for(int i = 0; i<num; i++){
            System.out.println(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
    public static void main(String[] args) {
        getFibonacci(30);
    }
}
