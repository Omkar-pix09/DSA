class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int n = i;
            boolean valid = true;

            while (n > 0) {
                int d = n % 10;

                if (d == 0 || i % d != 0) {
                    valid = false;
                    break;
                }

                n /= 10;
            }

            if (valid) list.add(i);
        }

        return list;
    }
}