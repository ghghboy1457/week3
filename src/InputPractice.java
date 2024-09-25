import java.util.Scanner;

public class InputPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자: ");
        int num2 = sc.nextInt();

        System.out.print("(연산자 + - * / )중 선택: ");
        char ch = sc.next().charAt(0) ;

        int result =0;

        if (ch == '+') {
            result = num1 + num2;
        } else if (ch == '-') {
            result = num1 - num2;
        } else if (ch == '*') {
            result = num1 * num2;
        } else if (ch == '/')
            result = num1 / num2;

        System.out.println("결과: " + result);
    }
}
