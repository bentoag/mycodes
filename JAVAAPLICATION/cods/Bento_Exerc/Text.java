class Text{

  // static String reverse(String plv){
  //   String guarda = "";
  //
  //   for ( int i = plv.length() -1 ; i >= 0; i--) {
	// 	  guarda += (plv.charAt(i));
  //   }
  //   return guarda;
  // }

  //**************Metodo palindrome**************

  static boolean palindrome (String txt) {
    String fim = "";
    String inicio = "";
    for (int f=txt.length()-1, i=0;i<txt.length();i++,f--){
      if(txt.charAt(f) !=' ' ) {
        fim += txt.charAt(f);
      }
      if (txt.charAt(i) !=' ') {
        inicio +=txt.charAt(i);
      }
    }
    // System.out.println(inicio); //conferir a string inicio
    // System.out.println(fim);   //conferir a string fim
  return inicio.equals(fim);
  }

//**************Metodo Strip**************

// static String strip(String frs, char qqr){
//   String resp = "";
//   for (int i = 0; i < frs.length() ; i++ ) {
//     if (frs.charAt(i) != qqr) {
//       resp += frs.charAt(i);
//     }
//   }
//   return resp;
// }
}
