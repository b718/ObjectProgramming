
class Circle {
    private int x, y, r; 
    private static double PI = 3.14; 

    public Circle() { //default const
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    public Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(Circle c) { //copy const
        this.x = c.x;
        this.y = c.y;
        this.r = c.r;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    // public String toString() {
    //  return x + y + r;
    // }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int r) {
        this.r = r;
    }

    public double area() {
        return Circle.PI*this.r*this.r;
    }

    public boolean intersect(Circle c) {
        return dist(c.x, c.y) < this.r + c.r;
    }

    private double dist(int x, int y) {
        return Math.hypot(this.x-x, this.y-y);
    }

}//end class
