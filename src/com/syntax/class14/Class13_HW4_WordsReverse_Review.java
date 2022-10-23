package com.syntax.class14;

public class Class13_HW4_WordsReverse_Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* How would you reverse a String word by word? For example:
		 * input=>This is sentence i want to reverse
		 * output=>sihT si ecnetnes i tnaw ot esrever
		 */
		
	
		String str = "This is the sentence I want to reverse";
		String[] arr = str.split(" ");
		StringBuilder st = new StringBuilder();
		
		for(int i = 0; i<arr.length; i++)
		{
			String word = arr[i];
			StringBuilder stringBuilder = new StringBuilder(word);
			stringBuilder.reverse();
			arr[i] = stringBuilder.toString();
			st.append(arr[i]).append(" ");
		}
		System.out.println(st);
		
	}

}
