package practice02_scovile;

import java.util.*;

public class Solution {
//	https://programmers.co.kr/learn/courses/30/lessons/42626 

	public static int solution(int[] scoville, int K) {
		PriorityQueue<Integer> q = new PriorityQueue<>();

		for (int i = 0; i < scoville.length; i++) {
			q.add(scoville[i]);
		}
		int count = 0;
		while (q.size() > 1 && q.peek() < K) {
			int weakHot = q.poll();
			int secondWeakHot = q.poll();

			int mixHot = weakHot + (secondWeakHot * 2);
			q.add(mixHot);
			count++;
		}

		
		
		if (q.size() <= 1 && q.peek() < K)
			count = -1;

		return count;
	}

	public static void main(String[] args) {
		int[] testlist = { 1, 2, 3, 9, 10, 12 };
		System.out.println(solution(testlist, 7));

	}

}
