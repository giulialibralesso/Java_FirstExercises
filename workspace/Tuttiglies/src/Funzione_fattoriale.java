
public class Funzione_fattoriale {

	public static int funzione (int numero) {
		int contatore = 1;
		while (numero > 0) {
			contatore = contatore * numero;
			numero = numero - 1;
		}
		return contatore;
	}
	
	public static void main(String[] args) {
	int ok = funzione (3);
	System.out.println(ok);
	}
}
