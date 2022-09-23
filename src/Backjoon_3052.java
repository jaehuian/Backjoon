import java.util.Scanner;

public class Backjoon_3052 {
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        int[] num=new int[10];
        int count=0;

        for(int i=0;i<10;i++){
            num[i]=sc.nextInt()%42;
        }
        for(int i=0;i<9;i++){
            for(int j=i+1;j<10;j++){
                if(num[j]!=-1){
                    if(num[i]==num[j]) {
                        count++;
                        num[j]=-1;
                    }
                }
            }
        }
        System.out.println(10-count);
        sc.close();
    }
}
