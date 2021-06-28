package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class inte {

	public static void main(String[] args) {
		Getduplicate("java");

	}

	public static void Getduplicate(String input) {

		String words[] = input.split("");

		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		

		//for (String word : words) {
          for(int i = 0; i<words.length;i++)
          {
        	String  word = words[i];
			if (wordcount.containsKey(word)) {

				wordcount.put(word, wordcount.get(word) + 1);
			} else {
				wordcount.put(word, 1);
			}

		}
		/* System.out.println(wordcount.keySet()); */
		Set<String> Wordstring = wordcount.keySet();

		for (String word : Wordstring) {

			if (wordcount.get(word) > 1) {
				System.out.println(word +":"+wordcount.get(word));
			}else {
				System.out.println(word +":"+wordcount.get(word));
			}

		}
	}
}
