package contas;
class Main2 {
  public static void main(String[] args) {
    ContaCorrente a = new ContaCorrente(123, 45678);
    System.out.println(a.agencia);
    System.out.println(a.numero);
    System.out.println(a.saldo());
    System.out.println(a.saldoSaque());
    a.depositarEmDinheiro(1000);
    System.out.println(a.saldo()); // 1500
    a.sacar(100);
    System.out.println(a.saldo()); // 1400

    ContaPoupanca pou = new ContaPoupanca(444, 555555);
    System.out.println(pou.saldo()); // 1000.0
    pou.depositarEmDinheiro(5000.0);
    System.out.println(pou.saldo()); // 6000.0
    pou.sacar(2000); // ContaPoupanca
    System.out.println(pou.saldo()); // 6000.0
    pou.sacar(1000);
    System.out.println(pou.saldo()); // 5000.0

    ContaEspecial esp = new ContaEspecial(666, 99999, 1000);
    System.out.println(esp.saldo()); // 500
    System.out.println(esp.saldoSaque()); // 1500
    esp.sacar(1200);
    System.out.println(esp.saldo());
    System.out.println(esp.saldoSaque());

    Cliente cli = new Cliente("Jefferson");
    
    cli.addConta(a);
    cli.addConta(pou);
    cli.addConta(esp);
    
    System.out.println(cli.getSaldo());
    
    
    
    
    
    
    
    
    
    
    
    
  }









}
