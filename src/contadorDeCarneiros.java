public class contadorDeCarneiros {
    public static void main (String[] args)    {

        System.out.println("Contando carneirinhos");
        //FOR
        for (int carneirinhos = 1; carneirinhos <= 10; carneirinhos++) {
            if (carneirinhos ==6)
                continue;
            else if (carneirinhos ==7)
                break;

            System.out.println("Carneirinho nº "+ carneirinhos);
        }

        String carneiros [] = { "Celso", "Pablo", "Leticia", "Julia", "Branquinho"};

        //FOR em ARRAY
        for (int i=0 ; i < carneiros.length; i++) {

            System.out.println("O carneiro nº "+ i + " é " + carneiros[i]);
        }
        //For Each
        for (String carneiro: carneiros) {
            System.out.println("O nome do carneirinho é " + carneiro);

        }

        System.out.println("A criança dormiu");
    }


    }

