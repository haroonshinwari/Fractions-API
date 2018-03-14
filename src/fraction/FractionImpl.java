package fraction;

public class FractionImpl implements Fraction {
    //CHANGE BACK TO PRIVATE
    public int numerator;
    public int denominator;
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
            System.out.println(fraction);

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
        int a = frac.numerator;
        int b = frac.denominator;
        int c = this.numerator;
        int d = this.denominator;

        int num = ((a*d) + (b*c));
        int den = (b*d);
        FractionImpl addresult = new FractionImpl(num,den);
        return addresult;
    }


    @Override
    public Fraction subtract(Fraction f) {
        return null;
    }


    @Override
    public Fraction multiply(Fraction f) {
        return null;
    }


    @Override
    public Fraction divide(Fraction f) {
        return null;
    }


    @Override
    public Fraction abs() {
        return null;
    }


    @Override
    public Fraction negate() {
        return null;
    }


    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    @Override
    public Fraction inverse() {
        return null;
    }


    @Override
    public int compareTo(Fraction o) {
        return 0;
    }



    @Override
    public String toString() {
        return null;
    }

}