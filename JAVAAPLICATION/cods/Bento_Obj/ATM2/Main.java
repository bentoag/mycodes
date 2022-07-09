class Main{
  public static void main(String[] args) {
    ATM atm = new ATM(2344499);
    System.out.println(atm.numeroSerie == 2344499);
    //atm.numeroSerie = 34883444;
    System.out.println();
    System.out.println(atm.consultarValor());
    System.out.println(atm.consultarValor() == 0);
    System.out.println();
    // abastecendo com 33 notas de 100
    atm.abastecer(33, 100);
    // verificando a quantidade de cédulas de 100
    System.out.println(atm.consultarQuantidade(100)); // 33
    // espera-se 33 cédulas
    System.out.println(atm.consultarQuantidade(100) == 33);
    // espera-se nenhuma cédula de qualquer outro valor
    System.out.println(atm.consultarQuantidade(5)); // 0
    System.out.println(atm.consultarQuantidade(5) == 0);
    System.out.println(atm.consultarQuantidade(50)); // 0
    System.out.println(atm.consultarQuantidade(50) == 0);
    System.out.println(atm.consultarQuantidade(3)); // 0
    System.out.println(atm.consultarQuantidade(3) == 0);
    System.out.println();
    atm.abastecer(8, 3); // 8 cédulas de R$ 3,00
    System.out.println(atm.consultarQuantidade(3) == 0);
    System.out.println();
    System.out.println(atm.consultarValor()); // 33 * 100 = 3300 reais
    System.out.println(atm.consultarValor() == 3300);
  }
}
