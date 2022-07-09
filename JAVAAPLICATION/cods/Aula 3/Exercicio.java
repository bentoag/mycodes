class Exercicio{

  public static void main(String[] args) {
    //String charAt,  lengtm, equals - Só pode usar esses métodos

    //Especificação para o Exercicio:

     String t = " Palavra ";
     String y = Text.trimLfet(t);
     System.out.println(l);  //"Palavra "
     System.out.println(l.equals("Palavra "));

     String r = Text.trimRight(t);
     System.out.println(r); //"  Palavra"
     System.out.println(r.equals("  Palavra"));

     String a = Text.trimAll(t);
     System.out.println(a); //"Palavra"
     System.out.println(a.equals("Palavra"));

     String d = " p  p ";
     System.out.println(Text.trimLfet(d).equals("p  p "));
     System.out.println(Text.trimRight(d).equals (" p  p"));
     System.out.println(Text.trimAll(d).equals("p  p"));

  }


}
