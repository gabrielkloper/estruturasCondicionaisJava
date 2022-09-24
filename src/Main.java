public class Main {
    public static void main(String[] args) {

        System.out.println("Exercícios de Estruturas Condicionais e de Repetição em Java");

        for(int x=1;x<=10;x++){
            if(x % 2==0) //% operador que representa módulo de uma divisão
                System.out.println(x);
        }

        int numero = 1;

        for(int x=1;x<2;x++){
            numero = numero + x;
        }
        System.out.println("O valor de número é: " + numero);

        boolean condicao = false;

        while(condicao){
            System.out.println("executou ... ");
    }
    }}
