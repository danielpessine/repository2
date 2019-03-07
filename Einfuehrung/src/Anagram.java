import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		
		String str1 = "String one";
		String str2 = "String owe";
		
		char [] str11 = str1.toCharArray();
		char [] str22 = str2.toCharArray();

		sindAnagramme(str11, str22);
		
		if(sindAnagramme(str11, str22))
		{
			System.out.println("Die gegebenen Strings sind Anagramme!");
		}
	}

static boolean sindAnagramme(char [] str11, char [] str22)
{
	int n1 = str11.length;
	int n2 = str22.length;
	
	if( n1 != n2 )
	{
		return false;
	}
	
	Arrays.sort(str11);
	Arrays.sort(str22);
	
	for( int i = 0; i < n2; i++)
	{
		if(str11[i] != str22[i])
		{
			return false;
		}
	}
	
	return true;
}
	
}
