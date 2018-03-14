package fraction;

public class Main {

    public static void main(String[] args) {
        FractionImpl frac = new FractionImpl(" 36    /      94 " );
        System.out.println(frac.numerator);
        System.out.println(frac.denominator);

    }
}