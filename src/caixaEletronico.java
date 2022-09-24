public class caixaEletronico {
    public static void main(String[] args) {
        double saldo = 20.0;
        double valorSolicitado = 15.0;
        String resultado = saldo >= valorSolicitado  ? "Boas Compras!" : "Não é possível realizar a compra";
        System.out.println(resultado);

        //IF, ELSE IF e ELSE
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;

            System.out.println("O seu saldo restante é: R$" + saldo);

        }else if (valorSolicitado == saldo) {
            saldo = saldo - valorSolicitado;
                System.out.println("Sua conta ficará zerada: R$" + saldo);
            } else {
            System.out.println("Saldo insuficiente");
        }
        }
    }

