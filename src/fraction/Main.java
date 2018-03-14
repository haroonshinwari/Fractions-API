package fraction;

public class Main {

    public static void main(String[] args) {
        FractionImpl frac = new FractionImpl(" 3 / 7" );
   /*     System.out.println(frac.numerator);
        System.out.println(frac.denominator);*/

        FractionImpl frac2 = new FractionImpl(1,4);
        frac.multiply(frac2);


    }
}