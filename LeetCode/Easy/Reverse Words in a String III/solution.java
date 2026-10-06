class Solution {
    public String reverseWords(String s) {
        char[] a = s.toCharArray();

        int start = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == ' ') {
                reverse(a, start, i - 1);
                start = i + 1;
            }
        }

        // Reverse the last word
        reverse(a, start, a.length - 1);

        return new String(a);
    }

    private void reverse(char[] a, int left, int right) {
        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }
    }
}