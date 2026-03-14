class GetEvenOdd{
    String checkEvenOdd(int num){
        return num % 2 == 0 ? "Even" : "Odd";
    }
}



public class EvenOdd{
    public static void main(String [] args){
        GetEvenOdd g1 = new GetEvenOdd();
        System.out.println(g1.checkEvenOdd(67));
    }
}