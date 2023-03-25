import java.io.*;
import java.util.*;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int a = Integer.parseInt(br.readLine());    //다솜이의 득표수 저장
        int result = 0;
        
        ArrayList<Integer> vote = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++) {                    //다솜이를 제외한 나머지 후보들의 득표수 저장 
            vote.add(Integer.parseInt(br.readLine()));
        }
        
        if(n == 1) { 
            System.out.println(0);
            return;
        }
        
        while(Collections.max(vote) >= a) {    // 다른 후보자들 중 최대값이 다솜이의 표보다 적어지면 종료 
            int i = vote.indexOf(Collections.max(vote));
            vote.set(i, vote.get(i) - 1);        // 최대값을 가진 후보자의 표 수를 하나 줄이고 다솜이의 표 수를 하나 늘림
            a++;
            result++;
        }
        
        System.out.println(result);
        
 
    }
 
}