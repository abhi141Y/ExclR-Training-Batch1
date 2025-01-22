public class LTC001 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversed = 0;

        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        LTC001 solution = new LTC001();

        System.out.println("Is 121 a palindrome? " + solution.isPalindrome(121));
        System.out.println("Is -121 a palindrome? " + solution.isPalindrome(-121));
        System.out.println("Is 10 a palindrome? " + solution.isPalindrome(10));
        System.out.println("Is 0 a palindrome? " + solution.isPalindrome(0));
        System.out.println("Is 1221 a palindrome? " + solution.isPalindrome(1221));
    }
}

