import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse String
    public static boolean reverseMethod(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return str.equals(rev);
    }

    // Method 2: Stack
    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        String rev = "";
        while (!stack.isEmpty()) {
            rev += stack.pop();
        }

        return str.equals(rev);
    }

    // Method 3: Deque
    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "madaminedenimadam"; // longer string for better comparison

        // Reverse Method
        long start1 = System.nanoTime();
        boolean res1 = reverseMethod(str);
        long end1 = System.nanoTime();

        // Stack Method
        long start2 = System.nanoTime();
        boolean res2 = stackMethod(str);
        long end2 = System.nanoTime();

        // Deque Method
        long start3 = System.nanoTime();
        boolean res3 = dequeMethod(str);
        long end3 = System.nanoTime();

        // Results
        System.out.println("Reverse Method: " + res1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + res2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + res3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}