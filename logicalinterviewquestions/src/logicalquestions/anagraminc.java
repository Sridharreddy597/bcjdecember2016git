package logicalquestions;

public class anagraminc {
	
	
	public static void main(String[] args) {
	game();
	}

	private static int game() {

		char  s1[] = {'r','e','c','i','t','a','o','s'};
		   char s2[] = {'a','r','t','i','c','l','e','s'};

		   char temp;

		   int i, j;
		   int n  = s1.length;
		   int n1 = s2.length;
		   if( n != n1) {    
			      System.out.println(s1+" and "+s2+ "%s are not anagrams! \n");
			      return 0;
			   }
		   for (i = 0; i < n-1; i++) {
			      for (j = i+1; j < n; j++) {
			         if (s1[i] > s1[j]) {
			            temp  = s1[i];
			            s1[i] = s1[j];
			            s1[j] = temp;
			         }
			         if (s2[i] > s2[j]) {
			            temp  = s2[i];
			            s2[i] = s2[j];
			            s2[j] = temp;
			         }
			      }
			   }
		   for(i = 0; i<n; i++) {
			      if(s1[i] != s2[i]) {    
			         System.out.println("Strings are not anagrams! \n");
			         return 0;
			      }
			   }
		   System.out.println("Strings are anagrams! \n");
		   return 0;
	}
	
	
	
	
	
	
	
	
	
}
