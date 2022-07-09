class Main {
  public static void main(String[] args) {
    String a = "Texto Teste";
    System.out.println(Text.upcase(a));
    System.out.println(Text.upcase(a).equals("TEXTO TESTE"));

    char l = 'a';
    System.out.println(Text.upcase(l));

    //percorrer a string e verificar se o caracter esta entre a-z? Se estiver -32

    char b = 'P';
    String f = "POO 2Sem";
    System.out.println(Text.downcase(b));
    System.out.println(Text.downcase(f));

    //SUBSTRING!!! 1 ind inclusivo  2 ind exclusivo
              //012345678
    String t = "tads ifrs";
    // System.out.println(t.substring(1, 3));
    // System.out.println(t.substring(5, 9));

    System.out.println(Text.substr(t, 5, 4)); //ifrs
    System.out.println(Text.substr(t, 5, 4).equals("ifrs")); //ifrs
    System.out.println(Text.substr("Programa", -3, 2)); //ifrs

    /*
    String c = "orientado a objetos";
    System.out.println(Text.capitalize(c));
    System.out.println(Text.capitalize(c).equals("Orientado a objetos"));
    System.out.println(Text.capitalize("uM teXto"));
    */
  }
}
