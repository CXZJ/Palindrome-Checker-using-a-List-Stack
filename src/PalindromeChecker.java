public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return true;
        }

        ListStack<Character> stack = new ListStack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        String[] testCases = {"racecar", "race", String.valueOf(1), null};

        for (String testCase : testCases) {

            if (isPalindrome(testCase)) {
                System.out.println(STR."\"\{testCase}\" is a palindrome.");
            } else {
                System.out.println(STR."\"\{testCase}\" is not a palindrome.");
            }
        }
    }
}
