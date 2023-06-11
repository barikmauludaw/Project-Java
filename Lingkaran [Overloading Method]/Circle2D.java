class Circle2D{
    private double x;
    private double y;
    private double radius;

    public Circle2D(double x,double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getx(){
        return this.x;
    }

    public double gety(){
        return this.y;
    }

    public double getradius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }

    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }

    public boolean contains(double x, double y){
        double jarak = Math.sqrt(Math.pow(this.x-x, 2) + Math.pow(this.y-y, 2));
        return jarak < getradius() ? true : false;
    }

    public boolean contains(Circle2D circle){
        double jarak = Math.sqrt(Math.pow(this.x - circle.getx(), 2) + (Math.pow(this.y - circle.gety(), 2))) + circle.getradius();
        return jarak < getradius() ? true : false;
    }

    public boolean overlaps(Circle2D circle){
        double jarak = Math.sqrt(Math.pow(this.x - circle.getx(), 2) + (Math.pow(this.y - circle.gety(), 2))) - circle.getradius();
        return jarak < getradius() ? true : false;
    }


}