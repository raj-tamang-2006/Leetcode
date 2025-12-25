class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if('A' <= s.charAt(i) && 'Z' >= s.charAt(i)){
                a.append((char)(s.charAt(i) - 'A' +'a'));
            }
            if('a' <= s.charAt(i) && 'z' >=s.charAt(i)){
                a.append((char)(s.charAt(i)));
            }
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                a.append(s.charAt(i));
            }
        }
        String cleaned = a.toString();
        String reversed = new StringBuilder(a).reverse().toString();
        if(cleaned.equals(reversed)){
            return true;
        }
        return false;
    }
}