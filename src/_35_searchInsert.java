public class _35_searchInsert {
	public static void main(String[] args) {
		_35_searchInsert searchInsert = new _35_searchInsert();
		int[] nums = {1, 3, 5, 6};
		System.out.println(searchInsert.searchInsert(nums, 7));


	}

	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length-1;
		int mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid-1;
			} else {
				left = mid+1;
			}
		}
		return left;
	}
}
