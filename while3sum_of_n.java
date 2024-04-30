package Day2;
import java.util.Scanner;
public class while3sum_of_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        int i =0;
        while(num >= i){
            sum = sum+i;
            i++;}
        System.out.println(sum);
    }
}
