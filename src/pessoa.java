public class pessoa {
    private  final  String name;
    private final int numb;
    private double saldo;
    public boolean verificado = false;
    private  double chequeEspecial;


    public pessoa(String name, int numb ,double saldoInicial) {
        this.name = name;
        this.numb = numb;
        this.saldo = saldoInicial;

        if (this.saldo <= 500.00){
            this.chequeEspecial = 50.00;
        } else {
            this.chequeEspecial = this.saldo * 0.2;

        }
    }

    public String getName() {return name;}

    public double getChequeEspecial() {return chequeEspecial;}

    public double getSaldoTotal() {
        return this.saldo + this.chequeEspecial;
    }

    public void verificaConta(int numbVerifique){
        if(this.numb == numbVerifique){
            verificado = true;
            System.out.printf("Bem vindo,%s! \n", getName());
            System.out.println("O que você pretende fazer hoje?");
        }else{
            System.out.println("Numero da conta não corresponde");
        }
    }

    public boolean verificarChequeEspecial(){
        if (this.saldo < this.chequeEspecial){
            System.out.println("você esta usando cheque especial");
            return true;
        }else{
            System.out.println("você não esta usando cheque especial");
            return false;
        }
    }

    public void aplicaTaxa(){
        if (verificarChequeEspecial()){

            double valorUsado = Math.abs(this.saldo);
            double taxa = valorUsado * 0.2;
            this.saldo -= taxa;

            System.out.println("uma taxa será descontado de" +  taxa);
            System.out.println("o valor do novo saldo" + this.saldo);
        }
    }

    public double deposidaSalto(double valor){
        aplicaTaxa();
        return this.saldo += valor;
    }

    public double sacarSaldo(double valor){
        return  this.saldo -= valor;
    }



}
