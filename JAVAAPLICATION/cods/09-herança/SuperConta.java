// Classe abstratas NÃO PODEM SER INSTANCIADAS
// parte-se do pressuposto que ela é INCOMPLETA
// É UM ESBOÇO!
abstract class SuperConta { // Conta Genérica
  // as "contas" terão:
  final int agencia, numero;
  private double saldo;

  SuperConta(int agencia, int numero, double saldo) {
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = saldo;
  }

  void depositarEmDinheiro(double valor) {
    saldo += valor;
  }

  void depositarEmCheque(double valor) {
    if (valor <= 10000) saldo += valor;
  }

  void sacar(double valor) {
    if (valor > this.saldoSaque()) return;
    saldo -= valor;
  }

  double saldo() {
    return this.saldo;
  }
  // abstract: as "filhas" devem concretizar
  // esse método!
  abstract double saldoSaque();












}
