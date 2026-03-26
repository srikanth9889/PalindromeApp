import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String str);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return str.equals(reversed);
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean isPalindrome(String str) {

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            deque.add(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}

// Context Class
class PalindromeService {

    private PalindromeStrategy strategy;

    public PalindromeService(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean check(String str) {
        return strategy.isPalindrome(str);
    }
}

// Main Class
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String str = "madam";

        // Choose strategy dynamically
        PalindromeService service1 = new PalindromeService(new StackStrategy());
        PalindromeService service2 = new PalindromeService(new DequeStrategy());

        System.out.println("Using Stack Strategy: " +
                (service1.check(str) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Using Deque Strategy: " +
                (service2.check(str) ? "Palindrome" : "Not Palindrome"));
    }
}