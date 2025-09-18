public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null) {
            return "";
        }

        int minlength = strs[0].length();

        for(int i=0; i<strs.length; i++) {
            if(strs[i].length() < minlength) {
                minlength = strs[i].length();
            }
        }
        String prefix = "";

        for(int i=0; i<minlength; i++) {
            char currentChar = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++ ) {
                if(strs[j].charAt(i) != currentChar) {
                    return prefix;
                }
            }
            prefix = prefix + currentChar;
        }
        return prefix;
    }
    public static void main(String args[]) {
        String strs [] = {"flower", "flow", "flight"};//
        System.out.println("Longest Common Prefix:" + longestCommonPrefix(strs)); 
    }
}
