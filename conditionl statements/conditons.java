
import java.util.Scanner;

public class conditons{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a== b){
            System.out.println("A is equal");
        } else{
            if(a > b ){
                System.out.println("A is greater ");
            }else{
                System.out.println("A is Lesser");
            }
        }

    }
}