public class _14_longestCommonPrefix {
	public static void main(String[] args) {
		_14_longestCommonPrefix lc = new _14_longestCommonPrefix();
		String[] strs = {"aa"};
		System.out.println(strs[0].substring(0,0));
		System.out.println(strs[0].substring(0,1));
		System.out.println(strs[0].substring(0,2));


		// System.out.println(lc.longestCommonPrefix(strs));
	}

	public String longestCommonPrefix(String[] strs) {
		String ans = "";
		if(strs.length == 0){
			return "";
		}
		for(int i = 0; i<strs[0].length();i++){
			String ansTemp = strs[0].substring(0, i+1);

			for (int j = 1; j < strs.length; j++) {
				if (strs[j].length() < i+1||!ansTemp.equals(strs[j].substring(0, i+1))) {
					return ans;
				}
			}
			ans = ansTemp;
		}
		return ans;

	}


}
