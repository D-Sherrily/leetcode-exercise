
/**
 * @ClassName: RangeBitwiseAnd
 * @Description: 数字范围按位与
 * @author: D
 * @create: 2020-07-01 16:09
 *
 **/

public class RangeBitwiseAnd {
    /**
     * 题目：给定范围 [m, n]，其中 0 <= m <= n <= 2147483647，返回此范围内所有数字的按位与（包含 m, n 两端点）。
     * 解答：暴力破解容易类型长度不够
     *          当 n>m 那么 m - n之间肯定有多于一位的数
     *          eg:
     *          2,4
     *          2:0 1 0     0 1         0
     *          3:0 1 1     0 1         0
     *          4:1 0 0     1 0         1
     *                   0        0            0     0
     *
     *          与运算  有0为0   全1为1
     *          如果n > m 那么m n 的末尾间隔 10101  01010  肯定有0
     *          所以只要n > m 那么最后一位肯定为0   用 i 记录 0 的个数
     *          然后右移 m n  继续比较
     *          直到 m = n 那么直接取 剩下 m 的值  就可以结束比较
     *          将剩下的 m 的值左移留出0 的位置  即得到结果
     *
     **/
    public static int rangeBitwiseAnd(int m, int n) {
       int i = 0;
       while (m < n){
          m>>>=1;
          n>>>=1;
          i++;
       }
        return m<<i;
    }


    public static void main(String[] args) {
        Integer i = rangeBitwiseAnd(2, 4);
        System.out.println(i);

    }
}
