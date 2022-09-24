import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class carrinhoDeCompras {
    public static void main(String[] args) {
        double mesada = 50.0;
        //WHILE
        while (mesada >0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada)
                valorDoce = mesada;
            System.out.println("Doce do valor: "+ valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        System.out.println("Discando...");

        //DO WHILE
        do {
            System.out.println("Telefone tocando");

        } while(tocando());
        System.out.println("Alô. Quem fala?");
    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return ! atendeu;
    }
}
