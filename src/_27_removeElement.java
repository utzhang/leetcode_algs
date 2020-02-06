public class _27_removeElement {
	public static void main(String[] args) {

	}

	public int removeElement(int[] nums, int val) {
		//删除的元素的数量
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				count++;
			} else {
				nums[i - count] = nums[i];
			}
		}

		return nums.length - count;

	}
}
