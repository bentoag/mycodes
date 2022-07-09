class ArCondicionado {

    private int t = 15;  //**Ainda falta
    final String marca;  //final significa constante (só pode ser definida 1 vez)
                //atributo marca
    final int min;
    final int max;


      //Declarando um construtor
      ArCondicionado(String marca, int min, int max) {
        this.marca = marca; //this.marca significa o atributo marca
        this.min = min;
        this.max = max;
      }

      ArCondicionado(String marca) {
        this.marca = marca;
        this.min = 17;
        this.max = 30;
      }


      void diminuirTemperatura(){
        if (t > min) t--;
      }
      void aumentarTemperatura(){
        if (t >= min && t < max) t++;
      }

      int temperatura (){
        return t;
      }
}
