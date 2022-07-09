class Main {
  public static void main(String[] args) {
                          //new --> invoca o construtor
                          //os atributos obrigatórios fazem parte do construtor
                          //marca é obrigatório - "Komeco"

      ArCondicionado ac = new ArCondicionado("Komeco");
      System.out.println(ac.marca);
      System.out.println(ac.temperatura()); //22
      ac.diminuirTemperatura(); //método que altera o estado
      System.out.println(ac.temperatura());


      ArCondicionado km = ac;  //variavel criada com o mesmo endereço '11010101'
                              //(O OBJETO É O MESMO)
      System.out.println();
      System.out.println();

      ArCondicionado nv = new ArCondicionado("LG", 16, 27);
      System.out.println(nv.marca);
      nv.aumentarTemperatura();
      nv.aumentarTemperatura();
      System.out.println(nv.temperatura());

  }
}
