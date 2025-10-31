import java.util.Arrays;

public class mergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) { // merge fun
        int idx = m+n-1, i= m-1, j= n-1;
        
        while(i>=0 && j>=0) {
            if(nums1[i] >= nums2[j]) {
                nums1[idx] = nums1[i];
                idx--;
                i--;
            } else  {
                nums1[idx] = nums2[j];
                idx--;
                j--;
            }
        }
        
        while (j>=0) {
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }

    public static void main(String[] args) {
        mergeSortedArray sol = new mergeSortedArray();
        int[] nums1 = {1,2,3,0,0,0};  
        int[] nums2 = {2,5,6}; 
        int m=3, n=3;

        sol.merge(nums1, m, nums2, n);

        System.out.println(Arrays.toString(nums1));   
    }
}
