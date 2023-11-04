import Utils.ListNode;

import java.util.NoSuchElementException;
import java.util.Stack;

public class EasyProblems {
    public static void main(String[] args) {


    }

    /**
     * 1. Two Sum
     * given an array and targer integer, return indices of two numbers that add to target
     *
     * @param nums
     * @param target
     * @return indices [a,b]
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < nums.length; k++) {
                if (i != k) {
                    if (nums[i] + nums[k] == target) {
                        int[] arr = {i, k};
                        return arr;
                    }
                }
            }
        }
        return null;
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        while (l1 != null || l2 != null) {
            int sum = 0;
            if (l1 != null && l2 != null) {
                sum = l1.val + l2.val;
            } else if (l2 == null) {
                sum = l1.val;
            } else {

            }
            if (sum > 9) {
                int ones = sum % 10;
                l1.val = ones;
                if (l1.next != null) {
                    l1.next.val += 1;
                } else {
                    l1.next = new ListNode(1, null);
                }
            } else {
                l1.val = sum;
            }
            if (l1.next == null) {
                l1.next = new ListNode(0);
            }

            l1 = l1.next;
            l2 = l2.next;


        }
        return temp;
    }


    /**
     * 9. Palindrome Number
     *
     * @param x
     * @return true or false if x reads the same from left to right and right to left
     */
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt((s.length() - 1) - i)) {
                return false;
            }
        }
        return true;
    }

    public static void printLinkedList(ListNode a) {
        if (a.next != null) {
            System.out.println(a.val);
            printLinkedList(a.next);
        } else {
            System.out.println(a.val);
        }
    }

    /**
     * 20. Valid Parentheses
     * true : open brackets are closed by same type AND
     * open brackets are closed in the correct order AND
     * closing brackets are opened by same type
     * @param s : string containing: '{', '}', '[', ']', '(', ')'
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                try {
                    char left = stack.pop();
                    if (left == '(' && c != ')' ||
                            left == '[' && c != ']' ||
                            left == '{' && c != '}') {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


}