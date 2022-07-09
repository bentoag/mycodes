class Main{
  public static void main(String[] args) {

    // Para o obejto café tem que informar: o tamanho, tipo do cafe e tipo do copo que ele será servido.
    //Ação pagar café, se o valor pago for maior do que o valor do café, devolver o troco. Se for menor, informar que tem que efetuar novo pagamento (dinheiro é devolvido)
    //Após confirmação de pagamento Preencher o copo até o tamanho.
    //Deve ser permitido adoçar o café, até 3 vezes. Se o cliente quiser adoçar mais que isso a ação é rejeitada.
    //é permitido consultar o tipo de copo, o valor, o tiṕo de café e o troco a ser recebido.
    //Os copos são de 2 tamanhos 180 e 250 ml.
    Cafe meucafe = new Cafe(250, "Moca", "Reciclável");

    System.out.println(meucafe.tipocafe());
    System.out.println(meucafe.qualcopo());
    System.out.println(meucafe.valordocafe());
    meucafe.pagarcafe(4.00);
    meucafe.adocarcafe();
    meucafe.adocarcafe();
    // meucafe.adocarcafe();
    // meucafe.adocarcafe();
    // System.out.println(meucafe.valorc());
    System.out.println(meucafe.troco());
    System.out.println();
    Cafe teucafe = new Cafe(180, "Cappuccino", "Xícara");

    System.out.println(teucafe.tipocafe());
    System.out.println(teucafe.valordocafe());
    System.out.println(teucafe.qualcopo());
    teucafe.pagarcafe(3.00);
    teucafe.adocarcafe();
    teucafe.adocarcafe();
    teucafe.adocarcafe();
    teucafe.adocarcafe();
    //System.out.println(teucafe.troco());

  }
}
