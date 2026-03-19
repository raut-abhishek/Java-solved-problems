public class ArmstrongNum {

    static int getFactorial(int num){
        int fact = 1;
        for(int i = 1; i<= num; i++){
             fact = fact * i;
        }
        return fact;
    }

    static boolean checkStrong(int num){
        int temp = num;
        int sum = 0;
        while (temp != 0){
            int digit = temp%10;
            sum += getFactorial(digit);
            temp/=10;
        }
        return sum == num;
    }


    public static void main(String[] args) {
        int num = 145;
        System.out.println(checkStrong(num));
    }
}
