import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número máximo para a sequência de Fibonacci: ");
        int max = input.nextInt();
        input.close();

        int num1 = 0, num2 = 1;
        System.out.print(num1 + " " + num2);

        while (num2 + num1 <= max) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
