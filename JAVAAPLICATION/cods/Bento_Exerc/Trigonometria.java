class Trigonometria {

  static double hipotenusa (double a, double b) {

    double c = (a*a)+(b*b);
    double precisao = 1e-12; // com 15 casas estoura
    double t = c;

    while (  (t - (c/t)) >  precisao*t) {
     t = ((c/t) + t)/ 2.0;
    }
    return t;
  }
}
