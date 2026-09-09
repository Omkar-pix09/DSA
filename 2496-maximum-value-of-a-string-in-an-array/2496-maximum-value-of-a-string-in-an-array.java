class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            int val = s.matches("\\d+") ? Integer.parseInt(s) : s.length();
            max = Math.max(max, val);
        }
        return max;
    }
}