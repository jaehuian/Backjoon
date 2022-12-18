import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Backjoon_1157 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().toUpperCase();
        int[] alpha = new int[26];
        int max=0;
        char result=' ';
        boolean overlap=false;

        for(char c:s.toCharArray()){
            if(max<++alpha[c-'A']){
                max=alpha[c-'A'];
                result=c;
                overlap=true;
            }
            else if(max==alpha[c-'A']){
                overlap=false;
            }
        }
        if(overlap==false) System.out.println("?");
        else System.out.println(result);

    }
}
