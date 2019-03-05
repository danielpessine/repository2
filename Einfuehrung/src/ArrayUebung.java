import java.util.ArrayList;
import java.util.List;


public class ArrayUebung {
	

	public static void main(String[] args) {

		monate();

	}
	
	public static void array()
	
	{
		List<String> wochentag = new ArrayList<>();
		wochentag.add("Montag");
		wochentag.add("Dienstag");
		wochentag.add("Mittwoch");
		wochentag.add("Donnerstag");
		wochentag.add("Freitag");
		wochentag.add("Samstag");
		wochentag.add("Sonntag");
		
		wochentag.set(4, "Nochnichtfreitag") ;
		 
		System.out.println(wochentag.get(4));
		
	}
	
	public static void wochentage()
	
	{
		List<String> wochentag = new ArrayList<>();
		wochentag.add("Montag");
		wochentag.add("Dienstag");
		wochentag.add("Mittwoch");
		wochentag.add("Donnerstag");
		wochentag.add("Freitag");
		wochentag.add("Samstag");
		wochentag.add("Sonntag");
		
		for(int i = 0; i < wochentag.size(); i++)
		{
			System.out.println(wochentag.get(i));
		}
	}
	
	public static void monate()
	{
		String monate [] = {"Januar", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "December"};
		int tage [] = {31,28,31,30,31,30,31,30,31,30,31,30};
		for(int i=0; i<12; i++)
		{
		System.out.println("Der Monat "+ monate[i]+" hat genau "+tage[i]+" Tage.");
		}
	}
}
