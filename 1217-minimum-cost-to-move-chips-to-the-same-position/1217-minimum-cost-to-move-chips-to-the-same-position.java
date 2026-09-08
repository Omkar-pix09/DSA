class Solution {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        for (int n : position)


if (n % 2 == 0) even++;

        return Math.min(even, position.length - even);
    }
}