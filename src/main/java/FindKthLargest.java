import java.util.*;
import java.lang.Object;
/**
 * @ClassName: findKthLargest
 * @Description: 数组中的第K个最大元素
 * @author: D
 * @create: 2020-06-29 17:51
 **/

public class FindKthLargest {
    public static int findKthLargest(Vector<Integer> nums, int k) {
        Object[] array = nums.stream().distinct().toArray();
        Arrays.sort(array);

        return (int)array[k-1];
    }

    public static int findKthLargest(int[] nums, int k) {

        Arrays.sort(nums);
        return nums[nums.length-k];

    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(2);
        vector.add(3);
        int i = findKthLargest(vector, 2);
        System.out.println(i);
    }
}



