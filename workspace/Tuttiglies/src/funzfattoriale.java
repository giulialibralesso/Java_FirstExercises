
public class funzfattoriale {
	
	static int myfacfun (int f) {
		int r = 1;
		while (f > 0) {
			r = r*f;
			f = f-1;
		}
		return r;
	}
	
	public static void stampo (int n) {
		int q = 0;
		for (q=0; n>q; q++) {
			System.out.println("ciao");
		}
	}
	
	public static void main(String[] args) {
		int fattorato = myfacfun (4);
		System.out.println(fattorato);
		stampo (4);
	}

}
