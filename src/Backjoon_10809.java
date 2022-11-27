import java.util.Scanner;

public class Backjoon_10809 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        Boolean find=false;

        for(int i=0;i<26;i++){
            find=false;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)==alpha.charAt(i)){
                    System.out.print(j+" ");
                    find=true;
                    break;
                }
            }
            if(find==false){
                System.out.print(-1+" ");
            }
        }
        sc.close();
    }
}