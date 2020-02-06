public class _28_strStr {
	public static void main(String[] args) {
		_28_strStr str = new _28_strStr();
		String s = "hello";
		String t = "";
		System.out.println(str.KMPIndex(s,t));

	}


	int KMPIndex(String s, String t) {
		if(t == "") return 0;
		int[] nextval = new int[100];
		int i = 0, j = 0;
		getNext(t, nextval);
		while (i < s.length() && j < t.length()) {
			if (j == -1 || s.charAt(i) == t.charAt(j)) {
				i++;
				j++;
			} else {
				j = nextval[j];
			}
		}
		if (j >= t.length()) {
			return (i - t.length());
		} else return -1;
	}
	//用来求next[j]=k
	public void getNext(String t, int[] nextval) {
		//j表示模式串的字符序号，k表示next[j]的序号
		int j = 0, k = -1;
		nextval[0] = -1;
		while (j < t.length()-1) {
			//k=-1是刚开始
			//
			if (k == -1 || t.charAt(j) == t.charAt(k)) {
				j++;
				k++;
				if (t.charAt(j) != t.charAt(k)) {
					nextval[j] = k;
				} else {
					nextval[j] = nextval[k];
				}
			} else {
				k = nextval[k];
			}
		}
	}
}
