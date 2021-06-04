import java.util.Scanner;

public class fattoriale {
	
	public static void main (String [] args)
	{
		int n = 4;
		int x = 1;
		int somma = 1;
		int salva = n;
		/*
		while (n-x > 0) {
			somma = somma*(n-x);
			n = n-1;
		}
		System.out.println(somma*salva);
		*/
		while (x <= n) {
			somma = somma * x;
			x = x + 1;
		}
		Scanner keyboard = new Scanner(System.in);
		System.out.println(somma);
		int myint = keyboard.nextInt();
		keyboard.next();
	}
}