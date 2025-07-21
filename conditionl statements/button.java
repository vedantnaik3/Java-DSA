import java.util.*;
public class button{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int button = sc.nextInt();

        if (button==1){
            System.out.println("Hello Vedant");
        }else if (button == 2) {
            System.out.println("Namaste Vedant");
        }else if (button == 3){
            System.out.println("Bonjour Vedant ");
        }else{
            System.out.println("Invalid BUtton");
        }
    }
}
