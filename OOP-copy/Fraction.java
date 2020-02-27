
class Fraction{

    private int top,bottom;
    //private String tops,slash,bottoms;
    //construtor
    public Fraction(){ //original construct
        this.top = 4;
        this.bottom = 6;

    }

    public Fraction(int top, int bottom){
        this.top = top;
        if(bottom == 0){
            System.out.println("Error, can't divide by zero!");
            bottom = 1;
        }else{
            this.bottom = bottom;

        }
    }

    public Fraction(String f){
        int slashindex = f.indexOf("/");
        String top1 = f.substring(0,slashindex);
        String bottom1 = f.substring(slashindex+1);
        this.top = Integer.parseInt(top1);
        int tempB = Integer.parseInt(bottom1);

        if(tempB == 0){
            System.out.println("Error! can't divide by zero!");
            bottom = 1;

        }else{
            this.bottom = tempB;

        }

    }

    public Fraction(Fraction c){ //copy construct
        // this.top = c.top;
        //if(bottom == 0){
        //   System.out.println("Errorˆ, can't divide by zero!");
        //  bottom = 1;
        // }else{
        //    this.bottom = c.bottom;
        // }
        
        this.top = c.top;
        this.bottom = c.bottom;
    }

    //accesor methods

    public int getNum(){
        return this.top;

    }

    public int getDenom(){
        return this.bottom;

    }

    public String toString(){
        return this.getNum() + "/" + this.getDenom();

    }

    public double toDouble(){
        double dubnum = this.top;
        return dubnum/this.bottom;
    }

    //mutator methods
    public void reduce(){
        top = top/gcf(this.top,this.bottom);

        bottom = bottom/gcf(this.top,this.bottom);

    }

    public void setNum(int top){
        this.top = top;

    }

    public void setDenom(int bottom){
        this.bottom = bottom;
    }

    //static methods

    public static Fraction multiply (Fraction a, Fraction b){
        int numerator = a.top * b.top;
        int denominator = a.bottom * b.bottom;

        Fraction f = new Fraction(numerator,denominator);
        f.reduce();
        return f;
    }

    public static Fraction divide(Fraction a, Fraction b){
        int numerator = a.top*b.bottom;
        int denominator = a.bottom * b.top;

        Fraction f = new Fraction (numerator,denominator);
        f.reduce();
        return f;
    }

    public static Fraction add(Fraction a,Fraction b){
        int numerator = 0;
        int denominator = 0;

        if(a.bottom == b.bottom){
            numerator = a.top + b.top;
            denominator = a.bottom;
        }else{
            numerator = a.top*b.bottom + b.top * a.bottom;
            denominator = a.bottom * b.bottom;

        }

        Fraction f =  new Fraction(numerator,denominator);
        f.reduce();
        return f;
    }

    public static Fraction subtract(Fraction a, Fraction b){
        int numerator = 0;
        int denominator = 0;

        if(a.bottom == b.bottom){
            numerator = a.top - b.top;
            denominator = a.bottom;
        }else{
            numerator = a.top*b.bottom - b.top * a.bottom;
            denominator = a.bottom * b.bottom;

        }

        Fraction f = new Fraction(numerator,denominator);
        f.reduce();
        return f;
    }

    //helper method

    private int gcf(int a, int b){
        int gcf = 0;
        int A = Math.abs(a);
        int B = Math.abs(b);
        if(A == 0 || B == 0){
            return 1;
        }

        while(A != B){
            if( A > B){
                A = A - B;

            }else{
                B = B - A;

            }

        }
        return A;
    }

    public void multiply(Fraction f){
        this.top = this.top * f.top;
        this.bottom *= f.bottom;
        this.reduce();

    }

}