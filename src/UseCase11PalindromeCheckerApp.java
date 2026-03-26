class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        return str.equals(reversed);
    }
}

public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(str)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}