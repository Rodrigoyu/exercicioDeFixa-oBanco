import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        pessoa ps = new pessoa("joao", 678, 600);

        while (true) {
        while (ps.verificado == false) {
            System.out.println("digite o numero da conta");
            ps.verificaConta(sc.nextInt());

        }


            System.out.println("digite aqui");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println(ps.getSaldoTotal());

                    break;
                case 2:

                    System.out.println(ps.getChequeEspecial());

                    break;
                case 3:
                    System.out.println("digite o valor de deposito:");
                    ps.deposidaSalto(sc.nextDouble());
                    System.out.println(ps.getSaldoTotal());
                    break;
                case 4:
                    System.out.println("digite o valor da retirada:");
                    ps.sacarSaldo(sc.nextDouble());
                    System.out.println(ps.getSaldoTotal());
                    break;
                case 5:
                    System.out.println("digite o valor do boleto");
                    ps.sacarSaldo(sc.nextDouble());
                    System.out.println(ps.getSaldoTotal());
                    break;
                case 6:
                    ps.verificarChequeEspecial();
                    break;
                case 0:
                    System.out.println("Encerando o programa");
                    return;
                default:
                    System.out.println("Opção não identificador");

            }
        }
    }
}