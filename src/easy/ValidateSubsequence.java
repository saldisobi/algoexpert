package easy;

class ValidateSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null || (s.length() > t.length())) {
            return false;
        }
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;

        }

        if (i == s.length())
            return true;

        return false;

    }


    public static void main(String args[]) {
        System.out.println(new ValidateSubsequence().isSubsequence("axc", "ahbgdc"));
    }
}