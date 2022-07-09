class Conta {

  //Atributos imutáveis (É)
  final int numero;
  final int agencia;
  final double saldoinicial;

  //Atributos mutáveis (Esta)
  private double saldo;

    Conta(int agc, int num){
    this.numero = num;
    this.agencia = agc;
    this.saldoinicial = 500.0;
    this.saldo = this.saldo + this.saldoinicial;
  }

    void sacar(double valorsq){
      if (this.saldo >= valorsq) {
        this.saldo = (this.saldo - valorsq);
      }else{
        System.out.println("Saldo Indisponível - SAQUE NÃO PERMITIDO");
      }
    }
    void depositarEmDinheiro(double dpsdin){
      if (dpsdin <= 1000.00) {
        this.saldo = (this.saldo + dpsdin);
      }
    }
    void depositarEmCheque(double dpscheque){
      if (dpscheque <=10000.00) {
        this.saldo = (this.saldo + dpscheque);
      }
    }

    double saldo(){
      return this.saldo;
    }

  }
