import java.util.Arrays;

public class find_the_median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total_len = (nums1.length + nums2.length);
        int[] total_list = new int[total_len];
        for (int i = 0; i < total_len; i ++){
            if(i < nums1.length)
                total_list[i] = nums1[i];
            else
                total_list[i] = nums2[i - nums1.length];
        }
        Arrays.sort(total_list);
        double median;
        double middle_two_didgets;
        if (total_list.length % 2 == 0) {
            middle_two_didgets = (total_list[total_len / 2] + total_list[(total_len / 2) - 1]);
            median = middle_two_didgets / 2;
        }

        else
            median = total_list[(total_len-1)/2];

        return median;
    }
    public static void main (String[] args){
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        find_the_median test = new find_the_median();
        System.out.println(test.findMedianSortedArrays(num1, num2));
    }
}

