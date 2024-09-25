import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("스코어:");
        int score = sc.nextInt();

        if (score >= 60) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
