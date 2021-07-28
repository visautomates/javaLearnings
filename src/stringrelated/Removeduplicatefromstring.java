package stringrelated;

public class Removeduplicatefromstring {

	public static void main(String[] args) {

		// usingJavaEt("Vishussss");
		usingIndexof("chaatsaes");
		// charterarrayuse("pror ");

	}

	static void usingJavaEt(String stringvalue) {

		StringBuilder sb = new StringBuilder();

		stringvalue.chars().distinct().forEach(s -> sb.append((char) (s)));
		System.out.print(sb);
		System.out.println();
	}
	

	static void usingIndexof(String stringvalue) {

		StringBuilder sb = new StringBuilder();
		
		int ve= stringvalue.length();

		for (int i = 0; i < stringvalue.length(); i++) {
			char ch = stringvalue.charAt(i);
			//System.out.print(ch);
			int indx = stringvalue.indexOf(ch, i + 1);
			if (indx == -1) {

				sb.append(ch);
				 System.out.print(ch);
				 
			}
		}System.out.println();

	}

	/*
	 * static void charterarrayuse(String stringvalue) {
	 * 
	 * StringBuilder sb = new StringBuilder();
	 * 
	 * char ch[] = stringvalue.toCharArray(); int length = ch.length; boolean
	 * repeated = false;
	 * 
	 * // pror
	 * 
	 * for (int i = 0; i < length; i++) {
	 * 
	 * for (int j = i + 1; j < length; j++) {
	 * 
	 * if (ch[i] == ch[j]) {
	 * 
	 * repeated = true;
	 * 
	 * } }if (!repeated) { sb.append(ch[i]); }
	 * 
	 * 
	 * } System.out.print(sb);
	 * 
	 * }
	 */
}
