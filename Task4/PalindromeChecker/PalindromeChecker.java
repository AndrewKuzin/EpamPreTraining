public class PalindromeChecker {
    public static boolean checkPalindrome(int number) {
        int number1 = number, revers = 0;
        while (number1 > 0) {
            revers = revers * 10 + number1 % 10;
            number1 /= 10;
        }
        if (number == revers) {
            return true;
        } else {
            return false;
        }
    }
}
