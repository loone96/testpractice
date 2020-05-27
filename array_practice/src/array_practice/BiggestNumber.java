package array_practice;

import java.util.Arrays;
import java.util.Collections;

public class BiggestNumber {
	public static void main(String[] args) {
		int[] numbers = {3, 30, 34, 5, 9};
		int length = numbers.length;
		String[] strArr = new String[length];
		for (int i = 0; i < length; i++) {
			strArr[i] = Integer.toString(numbers[i]);
		}		
//		String joinStr = String.join("", strArr);
//		String[] splitlist = joinStr.split("");
//		Arrays.sort(splitlist, Collections.reverseOrder());
//		String answerStr = String.join("", splitlist);
//		System.out.println(answerStr);
		for (String v : strArr) {
			System.out.println(v);
		} 
		System.out.println("========");
		Arrays.sort(strArr, Collections.reverseOrder());
		for (String v : strArr) {
			System.out.println(v);
		}
	}
}
