class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = word1[0], b = word2[0];
        boolean flag = true;
        for (int i = 1; i < word1.length; i++) {
            a = a + word1[i];
        }
        for (int i = 1; i < word2.length; i++) {
            b = b + word2[i];
        }

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    flag = false;
                }
            }
        } else {
            flag = false;
        }

        return flag;
    }
}