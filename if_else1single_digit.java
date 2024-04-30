package Day2;
import java.util.Scanner;

public class if_else1single_digit {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("s: ");
        int num= a.nextInt();
        String[] arry = {"zero","one","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if(num>=0&&num<=9){
            System.out.println(arry[num]);
        }
        else{
            System.out.println("not a single number");
        }
    }
}
