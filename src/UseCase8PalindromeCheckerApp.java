public class UseCase8PalindromeCheckerApp {

    // Node class
    static class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to check palindrome
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node prev = null;
        Node current = slow;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // Compare both halves
        Node first = head;
        Node second = prev;

        while (second != null) {
            if (first.data != second.data) {
                return false;
            }
            first = first.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "madam";

        // Create linked list
        Node head = new Node(str.charAt(0));
        Node temp = head;

        for (int i = 1; i < str.length(); i++) {
            temp.next = new Node(str.charAt(i));
            temp = temp.next;
        }

        // Check palindrome
        if (isPalindrome(head)) {
            System.out.println("The given string is Palindrome");
        } else {
            System.out.println("The given string is Not Palindrome");
        }
    }
}