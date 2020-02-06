import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;

public class _20_isValid {
	public static void main(String[] args) {
		_20_isValid cls = new _20_isValid();
		System.out.println(cls.isValid("()"));
		System.out.println(cls.isValid("()[]{}"));
		System.out.println(cls.isValid("(]"));
		System.out.println(cls.isValid("([)]"));
		System.out.println(cls.isValid("{[]}"));


	}

	public boolean isValid(String s) {

		Map<Character, Character> map = new HashMap<>();
		map.put(')', '(');
		map.put(']', '[');
		map.put('}', '{');

		ArrayDeque<Character> stack = new ArrayDeque();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if (map.containsValue(c)) {
				stack.push(c);
			} else if (map.containsKey(c)) {
				if (map.get(c).equals(stack.peek())) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
