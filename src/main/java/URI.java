import java.util.Scanner;

public class URI  {
    public static void main(String[] args) {
    Scanner pergunta = new Scanner(System.in);
    System.out.print("Digite um valor para A: ");
    int a = pergunta.nextInt();

    System.out.print("Digite um valor para B: ");
    int b = pergunta.nextInt();

    int X = a + b;
    System.out.println("X = " + X);

    pergunta.close();
    }
}
