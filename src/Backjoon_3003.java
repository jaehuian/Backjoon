import java.util.Scanner;

public class Backjoon_3003 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] piece={
            1-sc.nextInt(),
            1-sc.nextInt(),
            2-sc.nextInt(),
            2-sc.nextInt(),
            2-sc.nextInt(),
            8-sc.nextInt()};

        for(int i=0;i<6;i++){
            System.out.print(piece[i]+" ");
        }

        sc.close();
    }
}