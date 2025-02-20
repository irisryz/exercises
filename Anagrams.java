import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sortS = s.toCharArray();
        char[] sortT = t.toCharArray();

        Arrays.sort(sortS);
        Arrays.sort(sortT);

        return new String(sortS).equals(new String(sortT));
    }
}
