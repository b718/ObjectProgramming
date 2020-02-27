public class FractionDriver 
{

    public static void main(String[] args)
    {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(2,1);
        Fraction f3 = new Fraction("3/0");
        Fraction f4 = new Fraction(f2);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);

        System.out.println("Multiplication Section");
        System.out.println(f1 + " * " + f2 + " = " + Fraction.multiply(f1,f2));
        System.out.println(f1 + " * " + f3 + " = " + Fraction.multiply(f1,f3));
    }
}
