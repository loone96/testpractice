package pratice03_buildtower;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

class Main {
	public static int solution(int n, int k, int[] distance) {
		int answer = 0;

		ArrayList<Integer> intarr = new ArrayList<>();
		for (int i : distance) {
			intarr.add(i);
		}
		int minuslength = (n - 1) * ((n - 2) * (n - 3) / 2);
		int[] minus = new int[minuslength];

		int c = 0;
		int parta = 0;
		int partb = 0;
		int saveidx0 = 0;
		int saveidxi = 0;
		
		
		for (int i = 1; i < n; i++) {
			parta = Math.abs(distance[0] - distance[i]);

			saveidx0 = intarr.get(0);
			saveidxi = intarr.get(i);
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

			Arrays.sort(minus);
			answer = minus[0];
		}
		return answer;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = sc.nextInt();
		}
		System.out.println(solution(n, k, list));

	}
}
