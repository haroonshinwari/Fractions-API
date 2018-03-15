package fraction;

public class Main {

    public static void main(String[] args) {
        FractionImpl fracasdsad = new FractionImpl(" 3 / 7" );
   /*     System.out.println(frac.numerator);
        System.out.println(frac.denominator);*/

  /*      FractionImpl frac2asdasd = new FractionImpl(3,7);
        System.out.println(frac.compareTo(frac2));*/

        FractionImpl frac1 = new FractionImpl(1,2);
        FractionImpl frac2 = new FractionImpl(1,3);
        FractionImpl frac3 = new FractionImpl(1,4);
        FractionImpl frac4 = new FractionImpl(1,5);
        FractionImpl frac5 = new FractionImpl(2,3);
        FractionImpl frac6 = new FractionImpl(3,4);
        FractionImpl frac7 = new FractionImpl(2,7);

        frac6.subtract(frac3);

    }
}