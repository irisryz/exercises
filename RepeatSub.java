import java.util.ArrayList;

class Solution {
    public boolean repeatedSubstringPattern(String s) {
        boolean isGood;
        ArrayList<Integer> listDivisors = new ArrayList<>();

        for (int i = 1; i <= s.length() / 2; i++) { 
            if (s.length() % i == 0) {
                listDivisors.add(i);
            }
        }

        for (int j : listDivisors) {
            System.out.println("Checking divisor: " + j);
            String ref = s.substring(0, j); 
            isGood = true;

            for (int k = j; k < s.length(); k += j) { 
                if (!s.substring(k, k + j).equals(ref)) {
                    System.out.println("Mismatch found at " + k);
                    isGood = false;
                    break;
                }
            }

            if (isGood) {
                return true;
            }
        }

        return false;
    }
}
