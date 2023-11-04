import Utils.ListNode;

public class EasyProblems {
    public static void main(String[] args) {
        ListNode c = new ListNode(1, null);
        ListNode b = new ListNode(2, c);
        ListNode a = new ListNode(3, b);

        ListNode z = new ListNode(2, null);
        ListNode y = new ListNode(3, z);
        ListNode x = new ListNode(1, y);

        printLinkedList(a);
        addTwoNumbers(a, x);
        printLinkedList(a);


    }

    /**
     * 1. Two Sum
     * given an array and targer integer, return indices of two numbers that add to target
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
        while (l1.next != null && l2.next != null) {
            int sum = l1.val + l2.val;
            l1.val = sum;
            if (sum > 9) {
                int n = sum % 10;
                l1.val = n;
                l1.next.val += 1;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1;
    }


    /**
     * 9. Palindrome Number
     * @param x
     * @return true or false if x reads the same from left to right and right to left
     */
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt( (s.length()-1) - i)) {
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



}