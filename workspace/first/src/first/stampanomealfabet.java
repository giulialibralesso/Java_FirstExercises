package first;

public class stampanomealfabet {

	public static void alfabets (String a, String b) {
		int l = 0;
		boolean control = false;
		if (a.length() > b.length()) {
			l = b.length();
		}
		else {
			l = a.length();
		}
		for (int i = 0; i < l; i++) {
			int x = Character.getNumericValue(a.charAt(i));
			int y = Character.getNumericValue(b.charAt(i));
			if (x == y) {
				control = false;
			}
			if (x < y) {
				System.out.println(a);
				control = true;
			}
			else if (x > y) {
				System.out.println(b);
				control = true;
			}
			if (control == true) {
				break;
			}
		}
			if (control == false) {
				System.out.println(b);
			}
	}

	public static void main(String[] args) {
		String a = "ANNA";
		String b = "ANN";
		alfabets(a, b);
	}
}
