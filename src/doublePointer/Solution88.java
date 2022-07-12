package doublePointer;

public class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        int[] res = new int[m + n];
        int index = 0;
        while(i < m && j < n){
            if (nums1[i] <= nums2[j]){
                res[index++] = nums1[i++];
            }else {
                res[index++] = nums2[j++];
            }
        }
        if (i < m){
            for (int k = i; k < m; k++) {
                res[index++] = nums1[i++];
            }
        }
        if (j < n){
            for (int k = j; k < n; k++) {
                res[index++] = nums2[j++];
            }
        }
        for (int k = 0; k < m; k++) {
            nums1[k] = res[k];
        }
    }
}
