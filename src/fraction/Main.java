package fraction;

public class Main {

    public static void main(String[] args) {
        FractionImpl frac = new FractionImpl(" 1 / 4" );
        System.out.println(frac.numerator);
        System.out.println(frac.denominator);

        FractionImpl frac2 = new FractionImpl(2,3);
        frac.add(frac2);


    }
}