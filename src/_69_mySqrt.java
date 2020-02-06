/**
 * 实现 int sqrt(int x) 函数。
 *
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 *
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sqrtx
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _69_mySqrt {
	public static void main(String[] args) {
		_69_mySqrt s = new _69_mySqrt();
		System.out.println(s.mySqrt2(2147395600));
		System.out.println(s.mySqrt2(0));
		System.out.println(s.mySqrt2(1));
	}


	/**
	 * 穷举法，直接从1依次穷举到x/2找出根
	 * @param x
	 * @return
	 */
	public int mySqrt(int x) {
		if (x == 1) {
			return 1;
		}
		for (long i = 0; i <= x/2; i++) {
			if (i * i <= x && (i + 1) * (i + 1) > x) {
				return (int)i;
			}
		}
		return 0;
	}

	/**
	 * 二分法
	 * @param x
	 * @return
	 */
	public int mySqrt2(int x) {
		// if (x == 0 || x == 1) {
		// 	return x;
		// }
		long left = 0, right = x/2+1;
		while (left <= right) {
			long mid = (left+right)/2;
			if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
				return (int)mid;
			} else if (mid * mid > x) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return -1;
	}
}
