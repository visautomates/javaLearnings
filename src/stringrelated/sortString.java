package stringrelated;

import java.util.Arrays;

public class sortString {

	public static void main(String[] args) {
		
		System.out.println(sortst("acbdfe"));
	}
	
	static String sortst(String input)
	{
	char word[] = input.toCharArray();

      Arrays.sort(word);

     
	return new String(word);
	}

}
