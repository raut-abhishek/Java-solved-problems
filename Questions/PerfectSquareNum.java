public class PerfectSquareNum{

    static boolean isSquare(int num){
        if(num < 0) return false;
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }


    public static void main(String [] args){
        int num = 36;
        System.out.println(isSquare(num));
    }
}