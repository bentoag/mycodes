
class modrev {
  public static void main(String[] args) {

    //especificação
    String r = Text.padLeft("if", 6, '*');
    System.out.println(r);
      System.out.println(r.equals("****if"));
      System.out.println();


    String p = Text.padRight("rs", 6, '#');
    System.out.println(p);
      System.out.println(p.equals("rs####"));
      System.out.println();

      String t = Text.repeat('@', 10);
      System.out.println(t);
      System.out.println(t.equals("@@@@@@@@"));

  }
}
