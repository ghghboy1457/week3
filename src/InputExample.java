import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("영어로 이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();

        System.out.print("키: ");
        double height = sc.nextDouble();

        System.out.println("영어로 이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height + " cm");
        sc.close();
    }
}