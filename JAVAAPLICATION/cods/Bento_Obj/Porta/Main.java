class Main {
  public static void main(String[] args) {
    Porta p1 = new Porta(82, 210, "Angelim");
    System.out.println(p1.largura == 82); //true
    System.out.println(p1.altura == 210); //true
    System.out.println(p1.material.equals("Angelim")); //true
    System.out.println();
    System.out.println();

    // p1.largura = 233;
    // p1.altura = 3434;
    // p1.material = "Alumínio";

    System.out.println(p1.aberta()); // false
    System.out.println(p1.aberta() == false);
    System.out.println(p1.fechada() == true);
    System.out.println(p1.trancada()); // false
    System.out.println(p1.trancada() == false);

    System.out.println();
    System.out.println();
    p1.abrir();
    System.out.println(p1.aberta() == true);
    p1.fechar();
    System.out.println(p1.aberta() == false);
    p1.trancar();
    System.out.println(p1.trancada() == true);
    //Não é possível abrir
    p1.abrir();
    System.out.println(p1.aberta() == false);
    p1.destrancar();
    System.out.println(p1.trancada() == false);
    // pode abrir
    p1.abrir();
    System.out.println(p1.aberta() == true);
    p1.trancar();
    System.out.println(p1.trancada() == false);

    System.out.println();
    System.out.println();
    p1.fechar(); p1.trancar();
    System.out.println(p1.aberta() == false);
    System.out.println(p1.trancada() == true);


  }
}
