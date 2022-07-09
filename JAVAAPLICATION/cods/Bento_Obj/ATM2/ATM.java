class ATM {
  //Imutável
  final int numeroSerie;

  //Mutável
  private int ctcinco;
  private int ctdez;
  private int ctvinte;
  private int ctcinquenta;
  private int ctcem;
  private int qtdnotas;
  private int valortotal;



    ATM(int num){
      this.numeroSerie = num;
      this.ctcinco = 0;
      this.ctdez = 0;
      this.ctvinte = 0;
      this.ctcinquenta = 0;
      this.ctcem = 0;
      this.qtdnotas = 0;
      this.valortotal = 0;
    }

    void abastecer (int qtd, int valorcd){
      if (valorcd == 100 && qtd <=100) {
        this.ctcem = (this.ctcem + qtd);
      }else if (valorcd == 50 && qtd <=100) {
        this.ctcinquenta = (this.ctcinquenta + qtd);
      }else if (valorcd == 20 && qtd <=100) {
        this.ctvinte = (this.ctvinte + qtd);
      }else if (valorcd == 10 && qtd <=100) {
        this.ctdez = (this.ctdez + qtd);
      }else if (valorcd == 5 && qtd <=100) {
        this.ctcinco = (this.ctcinco + qtd);
      }else {
        System.out.println("Valor de Abastecimento Inválido");
      }
    }

    void retirar(int valor){
      
    }

    int consultarQuantidade (int valorcd){
      if (valorcd == 100) {
        this.qtdnotas = this.ctcem;
      }else if (valorcd == 50){
        this.qtdnotas = this.ctcinquenta;
      }else if (valorcd == 20) {
        this.qtdnotas = this.ctvinte;
      }else if (valorcd == 10) {
        this.qtdnotas = this.ctdez;
      }else if (valorcd == 5) {
        this.qtdnotas = this.ctcinco;
      }else{
        this.qtdnotas = 0;
      }

      return this.qtdnotas;
    }
      int consultarValor () {
        this.valortotal = ((100*this.ctcem) + (50*this.ctcinquenta) + (20*this.ctvinte) + (10*this.ctdez) + (5*this.ctcinco));
        return this.valortotal;
      }
}
