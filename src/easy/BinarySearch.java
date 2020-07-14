package easy;

public class BinarySearch {

    public int search(int num, int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int median =  (start + end) / 2;
            if (nums[median] == num) {
                return median;
            } else if (nums[median] < num) {
                start = median + 1;
            } else {
                end = median - 1;
            }
        }
        return -1;
    }


    public static void main(String args[]){
        System.out.println(new BinarySearch().search(4,new int[]{1,2,3,4,5}));
    }
}
