package fraction;

import java.security.KeyStore;

public class FractionImpl implements Fraction {
    //CHANGE BACK TO PRIVATE
    private int numerator;
    private int denominator;
    /**
     * Parameters are the <em>numerator</em> and the <em>denominator</em>.
     * Normalize the fraction as you create it.
     * For instance, if the parameters are <pre>(8, -12)</pre>, create a <pre>Fraction</pre> with numerator
     * <pre>-2</pre> and denominator <pre>3</pre>.
     *
     * The constructor should throw an <pre>ArithmeticException</pre> if the denominator is zero.
     *
     * @param numerator
     * @param denominator
     */
    public FractionImpl(int numerator, int denominator) {
        int n = numerator;
        int d = denominator;
        int gcd = 1;

        if (d == 0){
            throw new ArithmeticException("Divide by zero");
        }

        if (n > d) {
            gcd= GCD(numerator, denominator);
        } else if (d > n) {
            gcd = GCD(denominator, numerator);
        } else {
            n = d;
        }

        this.numerator = n/gcd;
        this.denominator = d/gcd;
    }

    private int GCD(int larger, int smaller) {
        int result = 0;
        while (true) {
            int remainder = larger % smaller;
            if (remainder == 0){
                result = smaller;
                break;
            }else{
                larger = smaller;
                smaller = remainder;
            }

            result = smaller;
        }
        return smaller;
    }

    /**
     * The parameter is the numerator and <pre>1</pre> is the implicit denominator.
     *
     * @param wholeNumber representing the numerator
     */
    public FractionImpl(int wholeNumber) {
        this.numerator = wholeNumber;
        this.denominator = 1;
    }

    /**
     * The parameter is a <pre>String</pre> containing either a whole number, such as `5` or `-3`, or a fraction,
     * such as "8/-12".
     * Allow blanks around (but not within) integers.
     * The constructor should throw an <pre>ArithmeticException</pre>
     * if given a string representing a fraction whose denominator is zero.
     * <p>
     * You may find it helpful to look at the available String API methods in the Java API.
     *
     * @param fraction the string representation of the fraction
     */
    public FractionImpl(String fraction) {

        if (fraction.contains(" ")) {
            fraction = fraction.replace(" ", "");
        }
        if (fraction.contains("/") == false){
            int num = Integer.parseInt(fraction);
            this.numerator = num;
            this.denominator = 1;
        } else {
            int m = fraction.indexOf("/");

            int num = Integer.parseInt(fraction.substring(0, m));
            int den = Integer.parseInt(fraction.substring(m + 1));

            int gcd = 1;

            if (den == 0){
                throw new ArithmeticException("Divide by zero");
            }

            if (num > den) {
                gcd= GCD(num, den);
            } else if (den > num) {
                gcd = GCD(den, num);
            } else {
                num = den;
            }

            this.numerator = num/gcd;
            this.denominator = den/gcd;
            }
    }


    @Override
    public Fraction add(Fraction f) {
        FractionImpl frac = (FractionImpl) f;
        int a = this.numerator;
        int b = this.denominator;
        int c = frac.numerator;
        int d = frac.denominator;

        int num = ((a*d) + (b*c));
        int den = (b*d);
        FractionImpl addresult = new FractionImpl(num,den);
        return addresult;
    }


    @Override
    public Fraction subtract(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;
        FractionImpl frac = (FractionImpl) f;
        int c = frac.numerator;
        int d = frac.denominator;

        int num = (a*d) - (b*c);
        int den = (b*d);
        FractionImpl subtractresult = new FractionImpl(num,den);
        return subtractresult;
    }


    @Override
    public Fraction multiply(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;
        FractionImpl frac = (FractionImpl) f;
        int c = frac.numerator;
        int d = frac.denominator;

        int num = (a*c);
        int den = (b*d);
        FractionImpl multiresult = new FractionImpl(num,den);
        return multiresult;
    }


    @Override
    public Fraction divide(Fraction f) {
        int a = this.numerator;
        int b = this.denominator;
        FractionImpl frac = (FractionImpl) f;
        int c = frac.numerator;
        int d = frac.denominator;

        int num = (a*d);
        int den = (b*c);
        FractionImpl divideresult = new FractionImpl(num,den);
        return divideresult;
    }


    @Override
    public Fraction abs() {
        int a = this.numerator;
        int b = this.denominator;


        if (a > 0 && b > 0) {
            FractionImpl absa = new FractionImpl(a, b);
            return absa;
        }else if (a > 0 && b < 0) {
            int den = b * -1;
            FractionImpl absb = new FractionImpl(a, den);
            return absb;
        }else if (a < 0 && b > 0) {
            int num = a * -1;
            FractionImpl absc = new FractionImpl(num, b);
            return absc;
        }else{
            int num = a * -1;
            int den = b * -1;
            FractionImpl absd = new FractionImpl(num, den);
            return absd;
        }

    }
    @Override
    public Fraction negate() {
        int a = this.numerator;
        int b = this.denominator;
        int nega = a * -1;
        int negb = b * -1;

        if (a < 0 && b > 0) {
            FractionImpl negatea = new FractionImpl(nega, b);
            return negatea;

        }else if (a > 0 && b < 0) {
            FractionImpl negateb = new FractionImpl(a, negb);
            return negateb;

        }else if (a > 0 && b> 0) {
            FractionImpl negatec = new FractionImpl(nega, b);
            return negatec;

        }else {
            FractionImpl negated = new FractionImpl(nega, negb);
            return negated;
            }
    }



    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {

        if(obj instanceof Fraction) {
            FractionImpl frac = (FractionImpl) obj;
            int result = frac.compareTo(this);
            if (result == 0) {
                return true;
            }else {
                return false;
            }
        }else{
            throw new ClassCastException();
        }

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public Fraction inverse() {
        int a = this.numerator;
        int b = this.denominator;

        FractionImpl inverse = new FractionImpl(b, a);
        return inverse;
    }


    @Override
    public int compareTo(Fraction o) {
        int a = this.numerator;
        int b = this.denominator;
        FractionImpl frac = (FractionImpl) o;
        int c = frac.numerator;
        int d = frac.denominator;

        float abdecimal = (float) a / b;
        float cddecimal = (float) c / d;

        if (abdecimal > cddecimal){
            return -24;
        }else if (abdecimal < cddecimal){
            return 24;
        }else{
            return 0;
        }
    }



    @Override
    public String toString() {
        int a = this.numerator;
        int b = this.denominator;

        if (b == 1) {
            return "" + a;
        }else if ((a ^ b) < 0){
            return "-" + Math.abs(a)+ "/" + Math.abs(b);
        }else if (a == 0) {
            return "0";
        }else{
            return "" + a + "/" + b;
        }

    }

}