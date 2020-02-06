/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _88_merge {
	public static void main(String[] args) {


	}


	/**
	 * 因为nums1的空间就是足够的，但是数组前面m位已经占满了，后面都是空的，于是考虑后续插入问题
	 *对比下面leecode官方的解答写法，思路是一样的，但是比我的简洁好多
	 * @param nums1
	 * @param m
	 * @param nums2
	 * @param n
	 */
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		//point1 指向数组1最后一位
		//point2 指向数组2最后一位
		//curr 指向结果数组的最后一位
		int point1 = m - 1, point2 = n - 1, curr = m + n - 1;
		while (curr >= 0) {
			if (point1 >= 0 && point2 >= 0) {
				if (nums1[point1] >= nums2[point2]) {
					nums1[curr] = nums1[point1];
					curr--;
					point1--;
				} else {
					nums1[curr] = nums2[point2];
					curr--;
					point2--;
				}
			//	因为是复制到数组1的，如果数组1还有位置，也没必要在复制了
			} else if (point1 >= 0) {
				nums1[curr] = nums1[point1];
				curr--;
				point1--;
			} else if (point2 >= 0) {
				nums1[curr] = nums2[point2];
				curr--;
				point2--;
			}
		}





	}
	public void merge2(int[] nums1, int m, int[] nums2,int n) {
		// two get pointers for nums1 and nums2
		int p1 = m - 1;
		int p2 = n - 1;
		// set pointer for nums1
		int p = m + n - 1;

		// while there are still elements to compare
		while ((p1 >= 0) && (p2 >= 0))
			// compare two elements from nums1 and nums2
			// and add the largest one in nums1
			nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

		// add missing elements from nums2
		System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
	}
}
