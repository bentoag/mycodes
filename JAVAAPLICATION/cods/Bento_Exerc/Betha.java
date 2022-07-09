class Betha {

  static String toMorse(String cod){

      String guarda = "";
      String txt = "";

      for (int i = 0; i < cod.length() ; i++ ) {

        switch (cod.charAt(i)){
          case 'a':
          case 'A' :
          guarda +=  ".-";
          break;
          case 'b':
          case 'B':
          guarda +=  "-...";
          break;
          case 'c':
          case 'C':
          guarda +=  "-.-.";
          break;
          case 'd':
          case 'D' :
          guarda +=  "-..";
          break;
          case 'e':
          case 'E':
          guarda +=  ".";
          break;
          case 'f':
          case 'F':
          guarda +=  "..-.";
          break;
          case 'g':
          case 'G' :
          guarda +=  "--.";
          break;
          case 'h':
          case 'H':
          guarda +=   "....";
          break;
          case 'i':
          case 'I':
          guarda +=  "..";
          break;
          case 'j':
          case 'J' :
          guarda +=  ".---";
          break;
          case 'k':
          case 'K':
          guarda +=   "-.-";
          break;
          case 'l':
          case 'L':
          guarda +=  ".-..";
          case 'm':
          case 'M':
          guarda +=   "--";
          break;
          case 'n':
          case 'N':
          guarda +=  "-.";
          break;
          case 'o':
          case 'O' :
          guarda +=  "---";
          break;
          case 'p':
          case 'P':
          guarda +=   ".--.";
          break;
          case 'q':
          case 'Q':
          guarda +=  "--.-";
          break;
          case 'r':
          case 'R' :
          guarda +=  ".-.";
          break;
          case 's':
          case 'S':
          guarda +=  "...";
          break;
          case 't':
          case 'T':
          guarda +=  "-";
          break;
          case 'u':
          case 'U' :
          guarda +=  "..-";
          break;
          case 'v':
          case 'V' :
          guarda +=  "...-";
          break;
          case 'w':
          case 'W':
          guarda +=  ".--";
          break;
          case 'x':
          case 'X':
          guarda +=  "-..-";
          break;
          case 'y':
          case 'Y' :
          guarda +=  "-.--";
          break;
          case 'z':
          case 'Z' :
          guarda +=  "--..";
          break;
          case ' ':
          guarda +=  "/";
          break;
        }
      }

      System.out.println(guarda); //verificar conversão do texto para minuscula
      return guarda;
  }
}
