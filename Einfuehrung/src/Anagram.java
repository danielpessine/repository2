import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		
		
		String str1 = "String one";
		String str2 = "String one";
		
		char [] str11 = str1.toCharArray();
		char str22 []= str2.toCharArray();

		sindAnagramme(str1, str2);
		
		if(sindAnagramme(str1, str2))
		{
			System.out.println("Die gegebenen Strings sind Anagramme");
		}
	}

static boolean sindAnagramme(char [] str1, char [] str2)
{
	int n1 = str1.length;
	int n2 = str2.length;
	
	if( n1 != n2 )
	{
		return false;
	}
	
	Arrays.sort(str1);
	Arrays.sort(str2);
	
	for( int i = 0; i < n2; i++)
	{
		if(str1[i] != str2[i])
		{
			return false;
		}
	}
	
	return true;
}
	
}
