class GetPrime{
    boolean checkPrime(int num){;
        if(num < 2) return false;
        for(int i = 2; i*i<=num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}


public class CheckPrime {
    public static void main(String[] args){
        GetPrime g1 = new GetPrime();
        System.out.println(g1.checkPrime(11));
    }
}
