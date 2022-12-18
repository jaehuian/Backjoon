import java.util.Scanner;

public class Backjoon_2675 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int casecount=0, loopcount=0;
        
        String s= new String();

        casecount=sc.nextInt();
        for(int c=0;c<casecount;c++){
            loopcount=sc.nextInt();
            s=sc.nextLine();
            for(int i=1;i<s.length();i++){
                for(int j=0;j<loopcount;j++){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
