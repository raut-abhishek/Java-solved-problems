public class ReverseNumber {

    static int getReverse(int num){
        int result = 0;
        while(num !=0){
            result *= 10;
            result += num% 10;
            num/=10;
        }
        return result;

    }
    public static void main(String[] args){
        System.out.println(getReverse(12345));
    }
}
