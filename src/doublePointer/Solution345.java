package doublePointer;

import java.util.ArrayList;
import java.util.List;

public class Solution345 {
    public static void main(String[] args) {
        String s = "hello";
        String s1 = reverseVowels(s);
        System.out.println(s1);
    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int n = s.length();
        int left = 0;
        int right = n - 1;
        char temp = ' ';
        while (left < right){
            while (left < n && !isContain(chars[left])){
                left ++;
            }
            while (right >= 0 && !isContain(chars[right])){
                right--;
            }
            if (left < right){
                temp = chars[right];
                chars[right] = chars[left];
                chars[left] = temp;
                left ++;
                right--;
            }
        }

        return new String(chars);

    }
    public static boolean isContain(char c){
        return "aeiouAEIOU".indexOf(c) >= 0;
    }
}
