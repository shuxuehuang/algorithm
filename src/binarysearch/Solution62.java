package binarysearch;

public class Solution62 {
    public int mySqrt(int x) {
        if (x <= 1){
            return x;
        }
        int l = 1, r = x;
        while(l < r){
            int m = l + (r -l)/2;
            int sqrt = x / m;
            if (sqrt == m){
                return m;
            }else if(m * m < x){
                l = m + 1;
            }else {
                r = m - 1;
            }
        }
        return r;
    }
}
