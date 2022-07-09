class Bento {
  public static void main(String[] args) {

    // double catOposto = 4.0;
    // double catAdjacente = 3.0;
    //
    // double hipotenusa = Trigonometria.hipotenusa(catAdjacente, catOposto);
    // System.out.println(hipotenusa);
    // System.out.println(Trigonometria.hipotenusa(7.0, 24.0) == 25.0);
    // System.out.println(Trigonometria.hipotenusa(7.0, 24.0));
    // System.out.println(Trigonometria.hipotenusa(792.0, 214.0) == 820.4023403184563);
    //
    // //casos de testes
    // System.out.println("***Casos de teste***");
    // //System.out.println(Trigonometria.hipotenusa(17.0, 50.20)); //com os cálculos em 3 casas decimais fecha 53
    // System.out.println(Trigonometria.hipotenusa(6.0, 8.0) == 10.0); //tem de imprimir true,pq é triangulo notavel
    // System.out.println(Trigonometria.hipotenusa(690.0, 133.0)); //deve ser == 702.701216734396
    // System.out.println(Trigonometria.hipotenusa(11.0, 20.2)== 23.000869548780106); //true precisao maxima conseguida de 14 casas, com 15 estoura

    //-------------------------------------------------------------------------------------------------------------------------------------------

    //Classe Text - Metodo reserve

    // String t1 = "teste";
    // String nome = "Bento Almeida Gonzaga";
    // String r1 = Text.reverse(t1);
    // System.out.println(r1); // etset
    // System.out.println(r1.equals("etset"));//true
    // System.out.println(Text.reverse("internet das coisas").equals("sasioc sad tenretni")); //true
    // System.out.println(Text.reverse("objeto").equals("otejbo"));//true
    // System.out.println("***Casos de teste***");
    // System.out.println(Text.reverse(nome)); //agaznoG adiemlA otneB
    // System.out.println(Text.reverse("123 Teste PaLavr@ /QuaLquEr").equals("rEuqLauQ/ @rvaLaP etset 321")); //false t(teste) em minusculo

    //Classe Text - Metodo Palindrome

    // String t2 = "pato";
    // boolean r2 = Text.palindrome(t2);
    // System.out.println(r2); // false
    // System.out.println();
    // System.out.println(r2 == false); // true
    // System.out.println();
    // System.out.println(Text.palindrome("Jose_Silva Sauro"));
    // System.out.println();
    // System.out.println(Text.palindrome("arara"));
    // System.out.println();
    // System.out.println(Text.palindrome("AmoraromA"));
    // System.out.println();
    // System.out.println(Text.palindrome("a cara rajada da jararaca") == true);
    // System.out.println();
    // System.out.println(Text.palindrome("ame O pOema") == false); // false pois é palindrome

    //Classe Text - Metodo Strip

    // String t3 = "tads: poo";
    // String r3 = Text.strip(t3, ':');
    // System.out.println(r3); // tads poo
    // System.out.println(r3.equals("tads poo")); //true
    // System.out.println(Text.strip(".teste....de.strip..", '.').equals("testedestrip")); //true
    // System.out.println(Text.strip("arara", 'a').equals("rr"));
    // System.out.println(Text.strip("analise e desenvolvimento de sistemas", 'e').equals("analis  dsnvolvimnto d sistmas"));//true
    // System.out.println(Text.strip("Bento Almeida Gonzaga", 'a')); //Bento lmeid Gonzg
    // System.out.println(Text.strip("123@@@#T@ste   @ 123@ @@---", '@').equals("123#Tste    123 ---"));//123#Tste    123 --- true

    //-------------------------------------------------------------------------------------------------------------------------------------------

    String alfa = "teste morse";
    String morse = Alpha.toMorse(alfa);
    System.out.println(morse); // "- . ... - . / -- --- .-. ... .";
    // Casos de Teste:
    System.out.println(morse.equals("-....-./-----.-.....")); //true
    // maiúsculas
    System.out.println(Alpha.toMorse("TESTE MORSE").equals("-....-./-----.-.....")); //true
    // ignorar não a-z, A-Z e espaço
    System.out.println(Alpha.toMorse("2333TESTE 0MORSE__?").equals("-....-./-----.-.....")); //true
    System.out.println(Alpha.toMorse("tEsTe morSE").equals("-....-./-----.-.....")); //true
    System.out.println(Alpha.toMorse("tadsmorse").equals("-.--.....-----.-.....")); //true

    //Casos de testes
    System.out.println(Alpha.toMorse("2333 E 123 A")); // == /.//.-
    System.out.println(Alpha.toMorse("Bento").equals("-....-.----")); //true
    System.out.println(Alpha.toMorse("tads TraBalho 1 Poo")); // == -.--...../-.-..--....-.-..--....---//.--.------



  }
}
