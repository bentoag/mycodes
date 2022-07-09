class  Text {
  static String padLeft (String s, int n, char c) {
    return repeat (c, n - s.length()) + s;
  }

  static String padRight (String x, int y, char z) {
    return x + repeat (z, y - x.length());
  }

  static String repeat (char a, int b) {
    String rep = "";
    for (int i = 0; i < b; i++ ) {
       rep += a;
    }
    return rep;
  }

}
