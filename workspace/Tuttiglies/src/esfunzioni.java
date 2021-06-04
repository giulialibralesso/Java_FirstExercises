
public class esfunzioni {

	static int divisione (int x, int y)
	{
		if (y > 0)	{
			return x/y;
		}
		
		else {
			return -1;	
		}
	}
	
	static int potenza (int base, int esponente)
	{
		int risultato = 1;
		if (esponente == 0)
		{
			return risultato;
		}
		while (esponente > 0)
		{
			risultato = risultato * base;
			esponente = esponente - 1;			
		}
		return risultato;
	}
	
	
	public static void main(String[] args) {
		int z = divisione (-3, 2);
		System.out.println(z);
		int elevato = potenza (2, 0);
		System.out.println(elevato);
	}

}