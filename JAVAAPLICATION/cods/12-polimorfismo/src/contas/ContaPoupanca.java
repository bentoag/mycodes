package contas;
class ContaPoupanca extends SuperConta {

  ContaPoupanca(int agencia, int numero) {
    super(agencia, numero, 1000.0);
  }

  @Override
  void sacar(double valor) {
    if (valor > 1000) return; // regra específica da poup
    super.sacar(valor); // regra geral
  }

  @Override
  double saldoSaque() {
    return this.saldo();
  }
}
