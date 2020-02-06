
/**
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 *
 */
public class _67_addBinary {
	public static void main(String[] args) {
		_67_addBinary addBinary = new _67_addBinary();
		String a = "1";
		String b = "111";
		System.out.println(addBinary.addBinary(a, b));

		String c = "1010";
		String d = "1011";
		System.out.println(addBinary.addBinary(c, d));

	}

	public String addBinary(String a, String b) {
		StringBuilder ansString = new StringBuilder("");
		int i = 0;
		int aIndex = a.length() - 1 - i;
		int bIndex = b.length() - 1 - i;
		//表示进位
		int tag = 0;
		while (aIndex >= 0 && bIndex >= 0) {

			int x = a.charAt(aIndex)-'0';
			int y = b.charAt(bIndex)-'0';
			int sum = x + y+ tag;
			ansString.append(sum % 2);
			tag = sum / 2;
			i++;
			aIndex = a.length() - 1 - i;
			bIndex = b.length() - 1 - i;
		}

		if (aIndex >= 0) {
			while (aIndex >= 0) {
				ansString.append((a.charAt(aIndex) - '0' + tag)%2);
				tag = (a.charAt(aIndex) - '0' + tag) / 2;
				i++;
				aIndex = a.length() - 1 - i;
			}
		}

		if (bIndex >= 0) {
			while (bIndex >= 0) {
				ansString.append((b.charAt(bIndex)-'0' + tag)%2);
				tag = (b.charAt(bIndex) - '0' + tag) / 2;
				i++;
				bIndex = b.length() - 1 - i;
			}
		}

		if (tag == 1) {
			ansString.append(tag);
		}
		return ansString.reverse().toString();
	}
}
