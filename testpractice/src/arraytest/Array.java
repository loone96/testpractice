package arraytest;

import java.util.*;

class Array {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		System.out.println(hm);
		System.out.println("--------------");
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}
		System.out.println(hm);

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] completion = { "1", "3", "4", "5" };
		String[] participant = { "1", "2", "3","4", "5"};
		System.out.println(solution(participant, completion));
	}
}