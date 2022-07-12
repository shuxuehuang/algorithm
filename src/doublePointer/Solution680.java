package doublePointer;

public class Solution680 {
    public boolean validPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if (chars[i] == chars[j]){
                i++;
                j--;
            }else {
                return validPalindrome(s,i+1,j) || validPalindrome(s,i,j-1);
            }
        }
        return true;
    }
    public boolean validPalindrome(String s,int low,int high){
        for (int i = low, j = high; i < j; i++ , j--) {
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
