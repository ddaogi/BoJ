import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String str= sc.nextLine();
		int sum =0;
		for(int i =0;i<str.length();i++) {
			sum += Integer.parseInt(""+str.charAt(i));
		}
		System.out.println(sum);
		
	
	}
	
	
}
