public class _9_TestReverse {
	public static void main(String[] args) {
		_9_TestReverse _9TestReverse = new _9_TestReverse();
		System.out.println(_9TestReverse.isPalindrome(121));
	}

	public boolean isPalindrome(int x) {
		if(x < 0) return false;

		int y = 0;
		while(x != 0){
			y = y*10 +  x%10;
			x = x/10;
		}
		if(y == x) return true;
		else return false;

	}
}