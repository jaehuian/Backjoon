import java.util.Scanner;

public class Backjoon_1157 {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        int count=0,maxc=-1;
        char result=0;
        boolean overlap=false;

        for(char i='A';i<='Z';i++){
            count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==i) count++;
            }
            if(maxc<count&&count!=0){
                maxc=count;
                result=i;
                
                if(overlap==true) overlap=false;
            }
            else if(maxc==count){
                overlap=true;
            }
        }
        if(overlap==false) System.out.println(result);
        else System.out.println("?");

        sc.close();
    }
}
