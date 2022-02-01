class Solution {
    public String sortSentence(String s) {
        String[] a = s.split(" ");
        String[] str = new String[a.length];
        String result = "";

        for (int i = 0; i < a.length; i++) {
            //taking last letter(number) from each word and putthing that word to that particual index in a new array.
            int index = Integer.parseInt(a[i].substring(a[i].length() - 1)) - 1;

            //Using .substring(0, a[i].length() - 1) to not get the last letter from each word becuase it's a number.
            str[index] = a[i].substring(0, a[i].length() - 1);
        }

        for (int i = 0; i < str.length; i++) {
            //Copying Array to string 
            result += str[i] + " ";

        }
        return result.trim();
    }
}