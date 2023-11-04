
public class EasyProblems {
    public static void main(String[] args) {

    }

    /**
     * 1. Two Sum
     * given an array and targer integer, return indices of two numbers that add to target
     * @param nums
     * @param target
     * @return indices [a,b]
     */
    public int[] twoSum(int[] nums, int target) {
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


//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        while (l1.next != null && l2.next != null) {
//            int sum = l1.val + l2.val;
//            if (sum > 9) {
//                int one = (sum /1) %10;
//                l.val =
//            }
//        }
//    }


    /**
     * 9. Palindrome Number
     * @param x
     * @return true or false if x reads the same from left to right and right to left
     */
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt( (s.length()-1) - i)) {
                return false;
            }
        }
        return true;
    }



}