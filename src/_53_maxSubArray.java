import java.util.Arrays;

public class _53_maxSubArray {
	public static void main(String[] args) {

		_53_maxSubArray maxSubArray = new _53_maxSubArray();
		int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int[] nums2 = {1};

		System.out.println(maxSubArray.maxSubArray3(nums2));


	}


	public int maxSubArray(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		return maxSubSum(nums, left, right);

	}

	/**
	 * 分治法求最大子序列和
	 * @param a 输入的整型数组
	 * @param left 数组左边界
	 * @param right 数组右边界
	 * @return 当前数组的最大子序列和
	 * 两种情况，数组只有一个元素、数组有两个以上的元素
	 */
	public int maxSubSum(int a[], int left, int right) {
		if (left == right) {
			return a[left];
		}

		int mid = (left + right) / 2;
		int maxLeftSum = maxSubSum(a, left, mid);
		int maxRightSum = maxSubSum(a, mid + 1, right);

		int maxLeftBorderSum = Integer.MIN_VALUE;
		int tempLeftBorderSum = 0;

		for (int i = mid; i >= left; i--) {
			tempLeftBorderSum += a[i];
			if (tempLeftBorderSum > maxLeftBorderSum) {
				maxLeftBorderSum = tempLeftBorderSum;
			}

		}

		int maxRightBorderSum = Integer.MIN_VALUE;
		int tempRightBorderSum = 0;
		for (int i = mid+1; i <= right; i++) {
			tempRightBorderSum += a[i];
			if (tempRightBorderSum > maxRightBorderSum) {
				maxRightBorderSum = tempRightBorderSum;
			}
		}

		return Math.max(maxLeftBorderSum + maxRightBorderSum, Math.max(maxLeftSum, maxRightSum));

	}

	/**
	 * 贪心算法
	 * @param nums 输入数组
	 * @return 返回最大子序列和
	 *
	 */
	public int maxSubArray2(int[] nums) {
		int n = nums.length;
		int currSum = nums[0], maxSum = nums[0];

		//currSum得到的是i结尾的子序列里面的最大子序列和（子序列的最大子序列和）
		//maxSum把上一步各个子序列里面最大的找出来
		for(int i = 1; i < n; ++i) {
			currSum = Math.max(nums[i], currSum + nums[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

	public int maxSubArray3(int[] nums) {
		int n = nums.length;
		int[] dp = new int[n];
		dp[0] = nums[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
		}

		// return Arrays.stream(dp).max().getAsInt();
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (dp[i] > sum) {
				sum = dp[i];
			}
		}
		return sum;

	}



}
