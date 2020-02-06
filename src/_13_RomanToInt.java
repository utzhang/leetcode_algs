import java.util.HashMap;
import java.util.Map;

public class _13_RomanToInt {
	public static void main(String[] args) {

		_13_RomanToInt test = new _13_RomanToInt();

		int iii = test.romanToInt("III");
		System.out.println(iii);

		System.out.println(test.romanToInt("IV"));
		System.out.println(test.romanToInt("IX"));
		System.out.println(test.romanToInt("LVIII"));
		System.out.println(test.romanToInt("MCMXCIV"));



	}

	public int romanToInt(String s) {
		Map<Character,Integer> vlaueMap = new HashMap();
		Map<Character,Integer> levelMap = new HashMap();

		vlaueMap.put('I', 1);
		levelMap.put('I', 1);

		vlaueMap.put('V', 5);
		levelMap.put('V', 5);

		vlaueMap.put('X', 10);
		levelMap.put('X', 10);

		vlaueMap.put('L', 50);
		levelMap.put('L', 50);

		vlaueMap.put('C', 100);
		levelMap.put('C', 100);

		vlaueMap.put('D', 500);
		levelMap.put('D', 500);

		vlaueMap.put('M', 1000);
		levelMap.put('M', 1000);

		int i = 0,sum = 0;

		while (i < s.length()) {
			if (i+1 == s.length()){
				sum = sum + vlaueMap.get(s.charAt(i));
				break;
			}
			if (levelMap.get(s.charAt(i)) < levelMap.get(s.charAt(i+1))){
				sum = sum + vlaueMap.get(s.charAt(i + 1)) - vlaueMap.get(s.charAt(i));
				i=i+2;
				continue;
			}

			sum = sum + vlaueMap.get(s.charAt(i));
			i++;

		}
		return sum;








	}
}
