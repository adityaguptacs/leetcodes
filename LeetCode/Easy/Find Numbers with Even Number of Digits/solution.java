class Solution {
    public int findNumbers(int[] a) {
        int ans = 0;

        for (int x : a) {
            int d = 0;

            do {
                d++;
                x /= 10;
            } while (x > 0);

            if (d % 2 == 0)
                ans++;
        }

        return ans;
    }
}