public class validPalindrome {
     public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            // Non-alphanumeric skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare after lowercase
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        validPalindrome sol = new validPalindrome();
        System.out.println(sol.isPalindrome("A man, a plan, a canal: Panama")); 
        System.out.println(sol.isPalindrome("race a car")); 
        System.out.println(sol.isPalindrome(" ")); 
    }
}
