import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Backjoon_15596 {
    static long sum(int[] a){
        long sum=0;

        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
    public static void main(String[] args) throws Exception{
        Scanner sc=new Scanner(System.in);
        List<Integer> a=new ArrayList<>();

        while(sc.hasNext()){
            a.add(sc.nextInt());
        }
        System.out.println(sum(a.stream().mapToInt(x->x).toArray()));
    }
}
