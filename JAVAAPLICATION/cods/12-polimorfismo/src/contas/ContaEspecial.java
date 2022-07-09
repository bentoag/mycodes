package contas;
class ContaEspecial extends ContaCorrente {

  private double limite;

  ContaEspecial(int agencia, int numero, double limite) {
    super(agencia, numero);
    this.limite = limite;
  }

  @Override
  double saldoSaque() {
    return this.saldo() + this.limite;
  }
}
