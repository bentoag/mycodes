class Suprimir{

  static String trimLefet (String inp){
    String resp = "";
    boolean ne = false;

   for ( int i= 0; i < inp.length() ; i++ ) {

     if (inp.charAt(i) != ' ' ){
       ne = true;
       if(ne){
         resp += inp.charAt(i);  //retorna toda a string
       }
     }

    }
  }
  return resp;
}

/*"  Teste  "
 Verificar se o primeiro caracter é " ", se for -> Suprimir
 Senao escreve a string
*/
