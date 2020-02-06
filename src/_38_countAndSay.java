/**
 * 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出外观数列的第 n 项。
 *
 * 注意：整数序列中的每一项将表示为一个字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-and-say
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class _38_countAndSay {

	public static void main(String[] args) {
		_38_countAndSay countAndSay = new _38_countAndSay();

			System.out.println(countAndSay.countAndSay(6));

	}

	//递归法
	//用到了StringBUffer,和String的区别是他是长度可变的，可以append扩展和delete删除
	public  String countAndSay(int n) {
		if (n == 1) {
			return "1";
		} else {
			int count = 0;
			StringBuffer lastStr = new StringBuffer(countAndSay(n - 1));
			StringBuffer ansStr = new StringBuffer();
			char currentChar = lastStr.charAt(0);
			for (int i = 0; i < lastStr.length(); i++) {
				if (currentChar == lastStr.charAt(i)) {
					count++;
				} else {
					ansStr.append(count);
					count =1;
					ansStr.append(currentChar);
					currentChar = lastStr.charAt(i);
				}
			}
			ansStr.append(count);
			ansStr.append(currentChar);
			return ansStr.toString();
		}
	}

	//不用递归
	//StringBuilder的话是非线程安全的，效率会高一些
	public String countAndSay2(int n) {
		StringBuilder ans = new StringBuilder();
		ans.append("1");
		for (int i = 2; i <= n ; i++) {
			//遍历前一个字符串
			String currentStr = new String(ans);
			ans.delete(0,ans.length());
			int num = 0;
			char currentChar = currentStr.charAt(0);
			for (char c : currentStr.toCharArray()) {
				if(c == currentChar){
					num++;
				}
				else{
					ans.append((char)('0'+num));
					ans.append(currentChar);
					currentChar = c;
					num = 1;
				}
			}
			ans.append((char)('0'+num));
			ans.append(currentChar);

		}

		return ans.toString();
	}
}
