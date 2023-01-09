import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Backjoon_2941 {
    static int check_pop(char c){
        switch(c){
            case '=':
            case '-':
            return 2;
            case 'j':
            return 1;
            default : return 0;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine(), tmp;
        int count=0;
        Stack<String> stack = new Stack<>();

        for(char c:s.toCharArray()){
            if(check_pop(c)==0){
            stack.push(Character.toString(c));
            }
            else if(check_pop(c)==2){
                tmp=stack.pop();
                if(tmp.equals("z")){
                    if(!stack.empty()&&stack.peek().equals("d")){
                        stack.pop();
                        count++;
                    }
                    else count++;
                }
                else {
                    count++;
                }
            }
            else if(check_pop(c)==1){
                if(!stack.empty()&&(stack.peek().equals("l")||stack.peek().equals("n"))){
                    stack.pop();
                    count++;
                }
                else {
                    count++;
                }
            }
            if(check_pop(c)==1 || check_pop(c)==2){
                while(!stack.empty()){
                    stack.pop();
                    count++;
                }
            }
        }
        while(!stack.empty()){
            stack.pop();
            count++;
        }
        System.out.println(count);
    }
}
