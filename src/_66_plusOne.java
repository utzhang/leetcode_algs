public class _66_plusOne {
	public static void main(String[] args) {
		_66_plusOne plusOne = new _66_plusOne();
		int[] digis = {1, 2, 3, 4};
		int[] digis2 = {1, 2, 4, 9, 9};
		int[] digis3 = {9, 9, 9, 9, 9};
		System.out.println(plusOne.plusOne(digis));
		System.out.println(plusOne.plusOne(digis2));
		System.out.println(plusOne.plusOne(digis3));


	}

	public int[] plusOne(int[] digits) {

		int i = digits.length - 1;

		//这里是短路的，一定要i>=0在前面，不然会报错
		while (i >=0&&digits[i] == 9) {
			digits[i] = 0;
			i--;
		}

		if (i < 0) {
			//创建的话会自动初始化为0
			int[] digisNew = new int[digits.length + 1];
			digisNew[0] = 1;
			return digisNew;
		} else {
			digits[i] = digits[i] + 1;
			return digits;
		}

	}
}
