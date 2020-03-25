import java.util.List;

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

    /**
     * https://www.interviewbit.com/problems/implement-strstr/
     */
    public static int strStr(final String A, final String B) {
        if (A.isEmpty() || B.isEmpty()) {
            return -1;
        }
        int lenthOfNeedle = A.length();
        for (int i = 0; i <= B.length() - lenthOfNeedle; i++) {
            if (A.substring(i, i+ lenthOfNeedle).equals(A)) {
                return i ;
            }

        }
        return -1;
    }

    /**
     * https://www.interviewbit.com/problems/reverse-the-string/
     */
    public static String solve(String A) {
        if (A.isEmpty()) {
            return A;
        }
        String[] words = A.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            if (i == 0) {
                stringBuilder.append(words[i]);
            } else {
                stringBuilder.append(words[i]).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    /**
     * https://www.interviewbit.com/problems/length-of-last-word/
     */
    public static int lengthOfLastWord(final String A) {
        if (A.isEmpty()) {
            return 0;
        }
        boolean wordFound = false;
        int answerLength = 0;
        for (int i = A.length() -1; i>= 0; i--) {
            if (A.charAt(i) == ' ' && wordFound) {
                break;
            }

            if (A.charAt(i) != ' '){
                answerLength++;
                wordFound = true;
            }
        }
        return answerLength;
    }

    /**
     * https://www.interviewbit.com/problems/amazing-subarrays/
     */
    public static int amazingSumarray(String A) {
        int total = 0;
        for (int i = 0; i < A.length(); i++) {
            if (isVowel(A.charAt(i))) {
                total += (A.length()-i);
            }
        }

        return total % 10003;
    }

    private static boolean isVowel(char a) {
        return a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' || a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u';
    }


    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(strStr("b","baba"));
//        System.out.println(solve("test a te"));
//        System.out.println(lengthOfLastWord("rachana mane"));
        System.out.println(amazingSumarray("ABEC"));
    }
}
