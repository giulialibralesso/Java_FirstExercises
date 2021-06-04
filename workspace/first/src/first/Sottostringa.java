package first;

public class Sottostringa {
	public static boolean find_substring (String a, String b) {
		int x=0;
		int conta=0;
		if (b.length() > a.length()) {
			return false;
		}
		for (int j=0; j<b.length(); j++) {
			for (int i=conta; i<a.length(); i++) {
				conta++;
				if (b.charAt(j) == a.charAt(i)) {
					x++;
					break;
				}
				else {
					x=0;
					j=0;
				}
			}
		}
		if (x==b.length()) {
			return true;
		}
		else return false;
	}
	public static void main(String[] args) {
		String a = "CIAO";
		String b = "CIAO";
		System.out.println(find_substring(a,b));
	}
}
