class Cafe{
  //imutáveis
  final int tamanho;
  final private String tipo;
  final private String copo;


  //mutáveis
  private double troco;
  private double valordocafe;
  private double apagar;
  private boolean adocar;
  private boolean preencher;
  private int c = 0;

    Cafe(int tmh, String cafe, String copo){
      this.tamanho = tmh;
      this.tipo = cafe;
      this.copo = copo;

      this.troco = 0.0;
      this.valordocafe = 0.0;
      this.apagar = 0.0;
      this.adocar = false;
      this.preencher = false;
    }
    //Métodos de Estado (Ação)

    void pagarcafe(double valor){
      if ( valor >=  this.valordocafe) {
        this.troco = valor - this.valordocafe;
        this.preencher = true;
      }else{
      System.out.println("Efetuar novo pagamento");
      }

      if (this.preencher == true) {

        for (int i = 0; i < this.tamanho ; i++ ) {
          if ( i == this.tamanho) {
            this.preencher = false;
          }
        }
      }
    }

    void adocarcafe(){
      this.adocar = !this.adocar;
      if ((this.adocar == true) && c < 3) {
        c = c + 1;
        this.adocar = false;
      }else{
        System.out.println("Não é mais possível adoçar");
        this.adocar = false;
      }
    }

                // int valorc(){
                //   return this.c; // consultar quantas adocicadas foram dadas
                // }


    //Métodos de Consulta
    double troco(){
      return this.troco;
    }
    String tipocafe(){
      return this.tipo;
    }
    String qualcopo(){
      return this.copo;
    }

    String valordocafe(){
      if (this.tipo.equals("Expresso")&& this.tamanho == 180) {
        this.valordocafe = 1.50;
      }else if (this.tipo.equals("Expresso")&& this.tamanho == 250) {
        this.valordocafe = 2.00;
      }else if(this.tipo.equals("Cappuccino")&& this.tamanho == 180) {
        this.valordocafe = 3.00;
      }else if(this.tipo.equals("Cappuccino")&& this.tamanho == 2.50) {
        this.valordocafe = 4.50;
      }else if(this.tipo.equals("Moca")&& this.tamanho == 180) {
        this.valordocafe = 2.50;
      }
      else if(this.tipo.equals("Moca")&& this.tamanho == 250) {
        this.valordocafe = 3.25;
      }else{
        System.out.println("Tipo de café inválido, escolha entre:Expresso, Cappuccino ou Moca");
      }
      return "R$ " + this.valordocafe;
    }
}
