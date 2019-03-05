
public class Ab4 

{
	
	public static void main(String[] args) 
	
	{
		
		int zahl = 0;
		
		for(int i = 0; i < 101; i++)
		if(zahl+i%quersumme(zahl)==0) {
			
		System.out.println(" "+ quersumme(zahl));
		
		}
		
	}

	public static int quersumme(int zahl)
	
	{
		
		if(zahl<10)
			
			{
			
			return zahl;
			
			}
		
		else 
			
			{
			
			return zahl / 10 + zahl % 10;
			
			}	
		
	}
	
	public static void ausgabe()
	{
		
		System.out.println("Henry hat keinen String");
	}
	
}
