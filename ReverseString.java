class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char[] re = new char[len];

        for (int i = 0; i < len; i++) {
            re[len - 1 - i] = s[i];
        }
        for (int i = 0; i < len; i++) {
            s[i] = re[i];
        }
    }
}
