class Solution {
    public String capitalizeTitle(String title) {
        //Removing spaces and storing words in an array
        String[] words = title.split(" ");
        StringBuilder str = new StringBuilder();
        for (String word : words) {
            if (word.length() > 2) {
                str.append(word.toUpperCase().charAt(0) + word.substring(1).toLowerCase() + " ");
            } else {
                str.append(word.toLowerCase() + " ");
            }
        }
        
        //removing leading and trailing spaces
        title = str.toString().trim();
        return title;
    }
}