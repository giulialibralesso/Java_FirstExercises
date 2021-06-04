
public class Funzione_intmaggiore {
	
	
	static int max (int a, int b) 
	{
		if (a > b) return a;
		else return b;
	}
	
	
	
	public static void main(String[] args) {
		int scatola = max (1, 5);
		System.out.println(scatola);
		sum (2, 8);
	}
	
	
	static int sum (int c, int d)
	{
		int e = c + d;
		System.out.println(e);
		return e;
	}	
}
