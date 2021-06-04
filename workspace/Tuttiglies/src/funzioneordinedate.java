
public class funzioneordinedate {

	public static int best (int a, int b, int c) {
		
		if (a > b && b > c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		 
		else if (a < b && a > c) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		
		else if (a > b && a < c) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		
		else if (a > c && c > b) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		
		else if (b > c && c > a) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		
		else if (c > b && b > a) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		int risultato = 0;
		return risultato;
	}		
	
	public static void main(String[] args) {
		int crono = best (1201, 1800, 1600);
		System.out.println("linea cronologica:" +crono);
	}

}
