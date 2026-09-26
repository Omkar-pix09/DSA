class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (words.length != pattern.length()) return false;

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);

            if (map.containsKey(c) && !map.get(c).equals(words[i]))
                return false;

            if (!map.containsKey(c) && set.contains(words[i]))
                return false;

            map.put(c, words[i]);
            set.add(words[i]);
        }

        return true;
    }
}