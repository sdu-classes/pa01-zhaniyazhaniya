class Circle {
    private double radius = 1.0;

    Circle(){
    }
  
    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference(){
        return 2* Math.PI *radius;
    }

    public String toString(){
        return "Circle[radius = " + radius + " ]";
    }

}
