public class UseCase9PalindromeCheckerApp {

    // Recursive function
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Check characters
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String str = "madam";

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}
