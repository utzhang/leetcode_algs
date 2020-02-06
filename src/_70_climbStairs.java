/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/climbing-stairs
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * 这本质上是一个斐波那契数列，
 * 假设第 i 阶可以由以下两种方法得到：
 *
 * 在第 (i-1)阶后向上爬一阶。
 *
 * 在第 (i-2)阶后向上爬 22 阶。
 *
 * 所以到达第 ii 阶的方法总数就是到第 (i-1)阶和第 (i-2) 阶的方法数之和。
 *
 */
public class _70_climbStairs {
	public static void main(String[] args) {

	}

	/**
	 * 动态规划解决斐波那契数列
	 * f(n)=f(n-1)+f(n-2)
	 * @param n
	 * @return
	 */
	public int climbStairs(int n) {
		if (n < 3) {
			return n;
		}

		int[] dp = new int[n+1];
		dp[1] = 1;
		dp[2] = 2;
		if (n > 2) {
			for (int i = 3; i <= n; i++) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}

		}
		return dp[n];

	}
}
