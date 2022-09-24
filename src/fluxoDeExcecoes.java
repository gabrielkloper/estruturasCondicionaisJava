import org.w3c.dom.ls.LSInput;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class fluxoDeExcecoes {
    public static void main(String[] args) {

       try {

           //Criando objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
        System.out.println("Tenho " + idade + " de idade" );
        System.out.println("Minha altura é " + altura + " cm");
        scanner.close();
       } catch (InputMismatchException e) {
           System.out.println(" Os campos idade e altura precisam ser numéricos");
           throw new RuntimeException(e);
       }
    }
}
