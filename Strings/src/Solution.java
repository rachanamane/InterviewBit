public class Solution {
    /**
     * https://www.interviewbit.com/problems/palindrome-string/
     */
    public static int isPalindrome(String A) {
        String alphanumeric = A.replaceAll("[^A-Za-z]","").toLowerCase();
        char[] chars = alphanumeric.toCharArray();
        for (int i = 0 ; i < chars.length/2 ; i++) {
           if (chars[i] != chars[chars.length - i - 1]){
               return 0;
           }
        }
        return 1;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
