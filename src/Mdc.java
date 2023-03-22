import java.util.Scanner;

public class Mdc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int a = input.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int b = input.nextInt();

        int mdc = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                mdc = i;
            }
        }

        System.out.println("O máximo divisor comum de " + a + " e " + b + " é " + mdc);
    }
}
