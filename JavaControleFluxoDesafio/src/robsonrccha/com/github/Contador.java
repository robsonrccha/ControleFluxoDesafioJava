package robsonrccha.com.github;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Por favor escolha o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.println("Agora escolha o segundo número: ");
            int num2 = sc.nextInt();

            contar(num1, num2);
            
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
            
        } catch (InputMismatchException e) {
            System.out.println("Escolha somente valores inteiros!");
            
        } finally {
            sc.close();
        }
    }

    static void contar(int num1, int num2) throws ValorNegativoException {
        if (num1 > num2) {
            throw new ValorNegativoException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = num2 - num1;
        System.out.println("Temos " + contagem + " interações entre os numeros escolhidos");

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo a interação " + i);
        }
    }
}
