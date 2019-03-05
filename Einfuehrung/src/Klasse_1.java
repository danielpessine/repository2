
public class Klasse_1 {
	
	static int beliebigeZahl;
	static int eineZahl;
	static int nochEineZahl;
	static int ergebnis;
	static float eineZahlMitKomma;
	static int ende;
	static int zahl=1;

	public static void main(String[] args) 
	
	{
		
	}

	public static void rechenspiele()
	
	{	
	ergebnis= eineZahl * nochEineZahl;
	
	if(ergebnis > eineZahlMitKomma)
	{
		System.out.println(ergebnis-eineZahlMitKomma);
	}
	else
	{
		System.out.println("Das Ergebnis ist zu klein");
	}
	}
	
	public static void ungerade()
	{
		while(ende < 500)
		{
			ende=zahl+2;
		}
	}
	
	public static void fibonacci()
	{
		int  wert_1 = 0, wert_2 = 1;
        
        while (wert_2 - wert_1 < 500)
        {
            System.out.println(wert_2);
        	int summe = wert_1 + wert_2;
            wert_1 = wert_2;
            wert_2 = summe;
            
            if(wert_2 - wert_1 > 500)
            {
            	System.out.println(wert_1);
            }
	}
}
}