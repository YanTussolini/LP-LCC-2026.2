import java.util.Scanner;
public class MenorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número inteiro:");
            numeros[i] = Integer.parseInt(leitor.nextLine());
        }

        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Menor número: " + menor);
        leitor.close();
    }
}
