public class Fraction {
    private Integer numerator, denominator;

    public Fraction(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Знаменатель равен нулю");
        }
        this.numerator = num1;
        this.denominator = num2;
        reduce();
    }

    private void reduce() {
        int nod = NOD(Math.abs(numerator), Math.abs(denominator));
        numerator /= nod;
        denominator /= nod;
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    private int NOD(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public Fraction sum(Fraction second) {
        int newNum = this.numerator * second.denominator + second.numerator * this.denominator;
        int newDen = this.denominator * second.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction minus(Fraction second) {
        int newNum = this.numerator * second.denominator - second.numerator * this.denominator;
        int newDen = this.denominator * second.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction mult(Fraction second) {
        int newNum = this.numerator * second.numerator;
        int newDen = this.denominator * second.denominator;
        return new Fraction(newNum, newDen);
    }

    public Fraction div(Fraction second) {
        if (second.numerator == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        int newNumerator = this.numerator * second.denominator;
        int newDenominator = this.denominator * second.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction sum(int number) {
        return sum(new Fraction(number, 1));
    }

    public Fraction minus(int number) {
        return minus(new Fraction(number, 1));
    }

    public Fraction mult(int number) {
        return mult(new Fraction(number, 1));
    }

    public Fraction div(int number) {
        return div(new Fraction(number, 1));
    }

    public Integer getDenominator() {
        return denominator;
    }

    public Integer getNumerator() {
        return numerator;
    }

    public void setDenominator(Integer denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(Integer numerator) {
        this.numerator = numerator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }
}
