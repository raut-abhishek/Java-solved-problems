public class NonRepeatingCharacter {

    public static char uniqueChar(String s) {
        int[] count = new int[256]; 

        
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }

        
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return s.charAt(i);
            }
        }

        return '-';
    }

    public static void main(String[] args) {
        String s = "aabbccd";
        char result = uniqueChar(s);

        if (result == '-') {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }
    }
}
