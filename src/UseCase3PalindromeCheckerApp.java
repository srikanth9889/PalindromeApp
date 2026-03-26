public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {

        String original = "madam";
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (original.equals(reversed)) {
            System.out.println("Result: Palindrome");
        } else {
            System.out.println("Result: Not Palindrome");
        }
    }
}