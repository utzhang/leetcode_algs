/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 *
 * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指仅由字母组成、不包含任何空格的 最大子字符串。
 *
 *示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 */
public class _58_lengthOfLastWord {
	public static void main(String[] args) {
		_58_lengthOfLastWord lengthOfLastWord = new _58_lengthOfLastWord();
		String s = "a ";
		String s2 = "Hello World";
		int length = lengthOfLastWord.lengthOfLastWord(s2);
		System.out.println(length);

	}

	public int lengthOfLastWord(String s) {
		//考虑到最后可能有空格的情况
		String trim = s.trim();

		int index = trim.lastIndexOf(' ');
		return trim.length() - index - 1;

	}
	public int lengthOfLastWord2(String s) {
		if (s == "") {
			return 0;
		}
		//考虑到最后可能有空格的情况
		String trim = s.trim();

		int count = 0;

		for (int i = trim.length() - 1; i >= 0; i--) {

			if (trim.charAt(i) == ' ') {
				return count;
			}
			count++;
		}
		return count;
	}

}
