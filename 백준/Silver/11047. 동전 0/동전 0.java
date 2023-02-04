import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int []units = new int [N];
        for(int i = 0;i<N;i++){

            units[i] = Integer.parseInt(br.readLine());
        }
        int count =0;
        for(int i = N-1;i>=0;i--){
            if(K>= units[i]){
                count += (K/units[i]);
                K = (K%units[i]);
            }
        }

        System.out.println(count);
    }
}