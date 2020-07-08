import java.util.*;

/**
 * @ClassName: SingleNumber
 * @Description: 只出现一次的数字
 * @author: D
 * @create: 2020-07-03 17:23
 **/

public class SingleNumber {
    /**
     * 题目：给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。 找出只出现一次的那两个元素。
     **/
    public static int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        //map.getOrDefault 当Map集合中有这个key时，就使用这个key值，如果没有就使用默认值defaultValue
        for (int n:nums) {
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int[] array = new int[2];
        int ids = 0;
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value == 1){
                array[ids++] = key;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4,3,1};
        int[] ints = singleNumber(a);
        System.out.println(Arrays.toString(ints));
    }


}
