public class _26_removeDuplicates {

	public static void main(String[] args) {
		_26_removeDuplicates cls = new _26_removeDuplicates();
		int[] nums = {0, 1, 2, 2, 3, 3, 4, 5};
		System.out.println(cls.removeDuplicates(nums));
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}



	}
	public int removeDuplicates(int[] nums) {
		int repeat = 0;
		// int count = 0;
		//因为第一个元素一定会保存下来，可以直接从第二个元素开始遍历
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				repeat++;
			} else {
				nums[i - repeat] = nums[i];
			}
		}
		return nums.length - repeat;

	}
}
