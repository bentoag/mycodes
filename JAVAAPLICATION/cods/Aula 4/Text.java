class Text {
    static char upcase (char c) {
      if(isLower(c)) return (char) (c - 32);
      return c;
    }

    static boolean isLower(char c) {
      return c >= 'a' && c <= 'z';
    }

    static String upcase(String s) {
      String r = "";

      for (int i = 0; i < s.length(); i++ ) {
        r += upcase(s.charAt(i));
      }
      return r;
    }

    //*******************************************

    static char downcase (char c) {
      if(isUpper(c)) return (char) (c + 32);
      return c;
    }

    static boolean isUpper(char c) {
      return c >= 'A' && c <= 'Z';
    }

    static String downcase(String s) {
      String r = "";

      for (int i = 0; i < s.length(); i++ ) {
        r += downcase(s.charAt(i));
      }
     return r;
    }

    //**********************************************

    static String substr ( String s, int ind, int qtd){
      //caso especial incio negativo
      if (ind < 0) {
        ind = s.length() + ind;
      }

      String r = "";
      for (int i = ind; i < ind + qtd ; i++ ) {
        r += s.charAt(i);

      }
      return r;
    }
}
