import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map1 = new HashMap<>(){{
            put("black", 0);
            put("brown", 1);
            put("red", 2);
            put("orange", 3);
            put("yellow", 4);
            put("green", 5);
            put("blue", 6);
            put("violet", 7);
            put("grey", 8);
            put("white", 9);
        }};
        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();
        long ans = (long)(map1.get(color1) * 10 + map1.get(color2)) * (long) Math.pow(10, map1.get(color3));
        System.out.print(ans);
    }
}
