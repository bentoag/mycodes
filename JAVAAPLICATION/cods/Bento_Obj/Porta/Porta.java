class Porta {
  //atributos imutáveis - constantes (É)
    final int altura;
    final int largura;
    final String material;
  //atributos mutáveis(Esta)
  private boolean aberta;
  private boolean trancada;

  Porta(int larg, int alt, String mat) {
        this.material = mat;
        this.largura = larg;
        this.altura = alt;
        this.aberta = false;
        this.trancada = false;
  }

  void abrir(){
    if (this.trancada == false) {
      this.aberta = true;
    }
  }
  void fechar(){
    this.aberta = false;
  }

  void trancar(){
    if (this.aberta == false) {
     this.trancada = true;
    }
  }
  void destrancar(){
    this.trancada = false;
  }
//Consulta
  boolean aberta(){
    return this.aberta;
  }
  boolean trancada(){
    return this.trancada;
  }
  boolean fechada(){
    return !this.aberta;
  }
}
