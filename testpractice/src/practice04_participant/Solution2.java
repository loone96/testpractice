package practice04_participant;

import java.util.*;

class Solution2 {
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] participant = { "mislay", "stanko", "ana", "mislay" };
		// String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = { "mislay", "stanko", "ana" };
		// String[] completion = {"marina", "josipa", "nikola", "filipa"};
		System.out.println(solution(participant, completion));
		// solution(participant, completion);
	};
}