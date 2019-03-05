public class Passwortchecker


{
	public static void main(String[] args) 
	
	{
		ausgabe();
	}
		public static void ausgabe()
		{
			String passwort = "1ghaljzztz";
			char[] passwortArray = passwort.toCharArray();
			ueberpruefung(passwortArray);
			
			if(laenge(passwortArray)==false)
			{
				System.out.println("Das Passwort ist nicht lang genug");
			}
			
			if(zahl(passwortArray)==false)
			{
				System.out.println("Das Passwort beinhaltet keine Zahlen");
			}
			
			if(sonderzeichen(passwortArray)==false)
			{
				System.out.println("Das Passwort beijnhaltet keine Sonderzeichen");
			}
			
			if(grossbuchstaben(passwortArray)==false)
			{
				System.out.println("Das Passwort beinhaltet keine Großbuchstaben");
			}
			
			if(kleinbuchstaben(passwortArray)==false)
			{
				System.out.println("Das Passwort beinhaltet keine Kleinbuchstaben");
			}
			
			if(ueberpruefung(passwortArray)==false)
			{
				System.out.println("Das Passwort ist nicht sicher");
			}
			
			else if(ueberpruefung(passwortArray)==true) {
				System.out.println("Das Passwort ist sicher!");
			}
		
	}
	
	public static boolean ueberpruefung(char [] passwortArray)
	{
		boolean i = false;
		boolean j = false;
		boolean k = false;
		boolean l = false;
		boolean h = false;
		kleinbuchstaben(passwortArray);
		laenge(passwortArray);
		grossbuchstaben(passwortArray);
		zahl(passwortArray);
		sonderzeichen(passwortArray);
		
		if(laenge(passwortArray)==true)
		{
			i = true;
		}
		
		if(zahl(passwortArray)==true)
		{
			j = true;
		}
		
		if(sonderzeichen(passwortArray)==true)
		{
			k = true;
		}
		
		if(grossbuchstaben(passwortArray)==true)
		{
			l = true;
		}
		
		if(kleinbuchstaben(passwortArray)==true)
		{
			h = true;
		}
		
		if(i == true && j == true && k == true && l == true && h == true)
		{
			return true;
		}
		
		return false;
		
	}
	
	public static boolean kleinbuchstaben(char [] passwortArray)
	//Prüfung auf Kleinbuchstaben
	{
		for(int i = 0; i < passwortArray.length; i ++)
		{
			
			if(Character.isLowerCase(passwortArray[i] ))	
			{
				return true;
				//System.out.println(passwortArray);
			}
		}
		return false;
	}
	
	public static boolean grossbuchstaben(char [] passwortArray) 
	//Prüfung auf Großbuchstaben
		{
			for(int i = 0; i < passwortArray.length; i++)
			{
				if(Character.isUpperCase(passwortArray[i]))	
				{
					return true;
				}
		}
		return false;
	}
	
	public static boolean laenge(char [] passwortArray)
	//Länge über 8 Zeichen
		{
			if(passwortArray.length > 8)	
			{
				return true;
			}
			return false;
		}
	public static boolean zahl(char [] passwortArray)
	//Ist eine Zahl enthalten
		{
				for(int i = 0; i < passwortArray.length; i++)
				{
					if(Character.isDigit(passwortArray[i]))	
					{
						return true;
					}
				}
					return false;
		}
	public static boolean sonderzeichen(char [] passwortArray)
	//Ist ein Sonderzeichen enthalten
		{
				for(int i = 0; i < passwortArray.length; i++)
				{
					if(Character.isDigit(passwortArray[i])!=true && Character.isLetter(passwortArray[i])!=true)	
					{
						return true;
					}
				}
					return false;
		}

}
