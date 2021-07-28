package collec;


import java.util.LinkedHashSet;
import java.util.Set;

public class setp {
	static char[] str;
	public static void main(String[] args) {
	duplicate("vissdjaas");
		

	}
	
	static void duplicate (String str) {
		
		StringBuffer  sb = new StringBuffer();
		Set<Character> setcha = new LinkedHashSet<Character>();
	  
		
		  for(int i =0;i<str.length();i++) 
		  
		  { setcha.add(str.charAt(i)); }
		  
		  for(Character s: setcha) {
		  
		  sb.append(s);
		  
		  }
		 
	System.out.print(sb);
	}
}
