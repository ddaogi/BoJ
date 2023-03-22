import java.io.*;
import java.util.*;

public class Main{
	
	static int [][]arr;
	static int [][]dp;
	static int n;
	static int k;
	public static void main(String[] args)throws IOException {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		arr = new int[n+1][2];
		dp = new int[n+1][k+1];
		

		for(int i = 1 ; i <= n ;i ++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		
		for(int i =1;i<=n;i++) {
			for(int j =1; j<=k;j++) {
				if(j >= arr[i][0]) // j가 무게보다 크다면
					dp[i][j] = Math.max(dp[i-1][j], arr[i][1]+dp[i-1][j-arr[i][0]]);
				else
					dp[i][j] = dp[i-1][j];
			}
		}
		
		System.out.println(dp[n][k]);
	}
}