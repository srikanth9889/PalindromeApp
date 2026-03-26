public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        // Convert to char array
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Result
        if (isPalindrome) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}