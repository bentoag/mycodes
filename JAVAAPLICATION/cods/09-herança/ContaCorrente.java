// ContaCorrente tem tudo o que SuperConta tem
// mais o que é específico dela
// Conta Corrente é um tipo de
class ContaCorrente extends SuperConta {

  ContaCorrente(int agencia, int numero) {
    super(agencia, numero, 500.0);
  }

  @Override // sobrescrevendo
  double saldoSaque() {
    return this.saldo(); // ou super.saldo();
  }



}
