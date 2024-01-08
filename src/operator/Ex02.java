package operator;

/**
 * Toán tử ++ và -- trong trường hợp là prefix, suffix
 * prefix: ++ -- trước được KQ rồi mới đem đi xử lý
 * suffix: Dùng KQ hiện tại đem đi tính toán rồi mới ++ -- sau
 */
public class Ex02 {
	public static void main(String[] args) {
		int digit = 8;
		int sffValue = digit++; // int sffValue = digit, digit = digit + 1
		System.out.println("sffValue: " + sffValue);
		System.out.println("digit: " + digit);
		
		
		System.out.println("=====================");
		
		int number = 8;
		int preValue = ++number; // number = number + 1, int sffValue = digit
		System.out.println("preValue: " + preValue);
		System.out.println("number: " + number);
		
		
		int a = 8;
		System.out.println(a++);
	}
}