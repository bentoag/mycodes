class Main {
  public static void main(String[] args) {

    Conta minhaConta = new Conta(3300, 33345);
    System.out.println(minhaConta.agencia == 3300);
    System.out.println(minhaConta.numero == 33345);
      //minhaConta.numero = 92932334;
    System.out.println();
    System.out.println(minhaConta.saldo());
    System.out.println(minhaConta.saldo() == 500.0);

    System.out.println();
    minhaConta.sacar(600.0);
    System.out.println(minhaConta.saldo()); // 500.0
    System.out.println(minhaConta.saldo() == 500.0);
    System.out.println();
    minhaConta.sacar(60.0); // 500.0 - 60.0 == 440.0
    System.out.println(minhaConta.saldo()); // 440.0
    System.out.println(minhaConta.saldo() == 440.0);
    //minhaConta.saldo = 1000000;
    minhaConta.depositarEmDinheiro(1100.0);
    System.out.println(minhaConta.saldo()); // 440.0
    System.out.println();
    System.out.println(minhaConta.saldo() == 440.0);
    minhaConta.depositarEmDinheiro(500.0); // 440.0 + 500.0 == 940.0
    System.out.println();
    System.out.println(minhaConta.saldo()); // 940.0
    System.out.println(minhaConta.saldo() == 940.0);
    System.out.println();
    minhaConta.depositarEmCheque(11100.0);
    System.out.println(minhaConta.saldo()); // 940.0
    System.out.println(minhaConta.saldo() == 940.0);
    System.out.println();
    minhaConta.depositarEmCheque(5000.0); // 940.0 + 5000.0 == 5940.0
    System.out.println(minhaConta.saldo()); // 5940.0
    System.out.println(minhaConta.saldo() == 5940.0);

  }
}
