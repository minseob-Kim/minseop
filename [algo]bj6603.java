package bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No6603 {
	static int[] print;
	static StringBuilder sb;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			int n = Integer.parseInt(st.nextToken());
			
			if(n == 0) break;
			
			int[] nums = new int[n];
			
			for (int i = 0; i < n; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			print = new int[6];
			sb = new StringBuilder();
			dfs(nums, n, 0, 0);
			System.out.println(sb);
		}
	}

	private static void dfs(int[] nums, int n, int cur, int start) {
		if(cur == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(print[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = start; i < n; i++) {
			print[cur] = nums[i];
			dfs(nums, n, cur+1, i+1);
		}
	}
}
