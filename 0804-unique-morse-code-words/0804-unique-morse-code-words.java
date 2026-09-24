class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] m = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
        "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",
        ".--","-..-","-.--","--.."};

        HashSet<String> set = new HashSet<>();

        for (String w : words) {
            String s = "";
            for (char c : w.toCharArray())
                s += m[c - 'a'];
            set.add(s);
        }

        return set.size();
    }
}