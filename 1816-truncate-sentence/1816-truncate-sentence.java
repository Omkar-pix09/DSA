class Solution {
    public String truncateSentence(String s, int k) {

        String[] words = s.split(" ");
        return String.join(" ", java.util.Arrays.copyOf(words, k));
        
    }
}