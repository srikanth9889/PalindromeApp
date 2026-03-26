public class UseCase2PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}