class Solution {
    public int reverse(int num){
        int result = 0;
        while(num != 0){
            int a = num % 10;
            result = result * 10 + a;
            num /= 10;
        }
        return result;
    }
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        else if(x == reverse(x)) return true;
        return false;
    }

}