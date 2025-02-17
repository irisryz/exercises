// leetcode 1768 


// sol 1
class MergeStringsAlt {
    public String mergeAlternately(String word1, String word2) {
        String save = "";
        String sol = "";
        if(word2.length() > word1.length()) {
            save = word2.substring(word1.length());
            word2 = word2.substring(0, word1.length());
        } else if (word1.length() > word2.length()) {
            save = word1.substring(word2.length());
            word1 = word1.substring(0, word2.length());
        }

        for(int i = 0; i < word1.length(); i++) {
            sol += word1.charAt(i);
            sol += word2.charAt(i);
        }

        sol += save;
        return sol;

    }
}
