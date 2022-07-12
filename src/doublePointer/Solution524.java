package doublePointer;

import java.util.HashSet;
import java.util.List;

public class Solution524 {
    public String findLongestWord(String s, List<String> dictionary) {

        String res = "";
        int length = 0;
        for (String s1 : dictionary) {
            if (isContain(s, s1)){
                if (s1.length() > length){
                    res = s1;
                    length = s1.length();
                }else if (s1.length() == length){
                    for (int i = 0; i < res.length(); i++) {
                        if (res.charAt(i) > s1.charAt(i)){
                            res = s1;
                        }
                    }
                }
            }
        }
        return res;
    }
    public boolean isContain(String s1, String s2){
        //判断s1中是否包含s2
        int m = s1.length();
        int n = s2.length();
        if (m < n){
            return false;
        }
        int i = 0,j = 0;
        while(i < m && j < n){
            if(s1.charAt(i) != s2.charAt(j)){
                i++;
            }else {
                i++;
                j++;
            }
        }
        if (j==n){
            return true;
        }else {
            return false;
        }
    }
}
