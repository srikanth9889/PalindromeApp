public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "Madam In Eden Im Adam";

        // Normalize string
        String cleaned = str.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";

        // Reverse string
        for (int i = cleaned.length() - 1; i >= 0; i--) {
            reversed = reversed + cleaned.charAt(i);
        }

        // Check palindrome
        if (cleaned.equals(reversed)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}