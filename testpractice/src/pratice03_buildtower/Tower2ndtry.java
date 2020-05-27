package pratice03_buildtower;

import java.util.*;
import java.lang.Math.*;

class Tower2ndtry {

	public static int solution(int n, int k, int[] distance) {
		int answer = 0;
		int count = n - 1;
		if (distance.length % 2 == 0) {
			// 짝수
			ArrayList<Integer> intarr = new ArrayList<>();
			for (int i : distance) {
				intarr.add(i);
			}
			int minuslength = (n - 1) * ((n - 2) * (n - 3) / 2);
			int[] minus = new int[minuslength];

			int c = 0;

			for (int i = 1; i < n; i++) {
				int parta = Math.abs(distance[0] - distance[i]);
				int partb = 0;

				int saveidx0 = intarr.get(0);
				int saveidxi = intarr.get(i);
				intarr.remove(i);
				intarr.remove(0);

				int newlength = intarr.size();
				for (int x = newlength - 1; x >= 0; x--) {
					for (int y = 0; y < x; y++) {
						partb = Math.abs(intarr.get(y) - intarr.get(x));
						minus[c++] = parta + partb;
					}
				}
				intarr.add(0, saveidx0);
				intarr.add(i, saveidxi);
			}

			Arrays.sort(minus);
			answer = minus[0];
		} else {
			// 홀수
			ArrayList<Integer> intarr = new ArrayList<>();
			for (int i : distance) {
				intarr.add(i);
			}
			int minuslength = (n - 1) * ((n - 2) * (n - 3) / 2);
			int[] minus = new int[minuslength];

			int c = 0;

			for (int i = 1; i < n; i++) {
				int parta = Math.abs(distance[0] - distance[i]);
				int partb = 0;

				int saveidx0 = intarr.get(0);
				int saveidxi = intarr.get(i);
				intarr.remove(i);
				intarr.remove(0);

				int newlength = intarr.size();
				for (int x = newlength - 1; x >= 0; x--) {
					for (int y = 0; y < x; y++) {
						partb = Math.abs(intarr.get(y) - intarr.get(x));
						minus[c++] = parta + partb;
					}
				}
				intarr.add(0, saveidx0);
				intarr.add(i, saveidxi);
			}

			Arrays.sort(minus);
			answer = minus[0];
		}
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(solution(n, k, list));

//		int n = 5;
//		int k = 2;
//		int[] distance = { 1, 3, 4, 6, 12 };
//		solution(n, k, distance);
	}
}
