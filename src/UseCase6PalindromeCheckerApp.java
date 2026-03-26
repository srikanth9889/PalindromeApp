import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Add characters to both
        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));   // FIFO
            stack.push(str.charAt(i));  // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Result
        if (isPalindrome) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}