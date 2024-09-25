import java.util.Scanner;

public class NestedIfExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번쨰 수: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 수: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("두 수의 값은 같다");
        } else {
            if (num1 > num2) {
                System.out.println("첫번째 수가 크다.");
            } else {
                System.out.println("두번째 수가 크다");
            }
        }
    }
}
