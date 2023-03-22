import java.util.Scanner;
public class Contagem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();
        System.out.print("Digite o conjunto de números separados por espaço: ");
        String numerosStr = sc.nextLine();
        sc.close();
        
        String[] numerosArr = numerosStr.split(" ");
        int[] numeros = new int[numerosArr.length];
        for (int i = 0; i < numerosArr.length; i++) {
            numeros[i] = Integer.parseInt(numerosArr[i]);
        }
        
        int primeiroDado = numeros[0];
        
        int contador = 0;
        for (int i = primeiroDado; i <= n; i++) {
            contador++;
        }
        
        System.out.println("Existem " + contador + " valores inteiros entre o primeiro dado (" + primeiroDado + ") e " + n);
    }
    
}
