public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	public static int difference(int num1, int num2) {
		return num1 - num2;
	}
	public static double product(double num1, double num2) {
		return num1*num2;
	}
	public static String removeFirst(String s) {
		return s.substring(1);
	}
	public static int combinedLength(String s1, String s2) {
		String combined = s1 + "" + s2;
		return combined.length();
	}
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	public static boolean isOdd(int num) {
		return num % 2 != 0;
	}
	public static boolean isPositive(int num) {
		return num > 0;
	}
	public static boolean isNegative(int num) {
		return num < 0;
	}
}
