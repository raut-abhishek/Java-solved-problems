public class CheckPalindromeNum {

    static boolean checkPalindromeNumber(int num){
        int reversed = 0, temp = num; 
        while(temp !=0){
            reversed *= 10;
            reversed += temp% 10;
            temp/=10;
        }
        return num == reversed;

    }
    public static void main(String[] args){
        System.out.println(checkPalindromeNumber(111));
    }
}


