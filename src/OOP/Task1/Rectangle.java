package OOP.Task1;

public class Rectangle extends Shape{
    double xLeft, yLeft, xRight, yRight;
    Rectangle(double xLeft, double yLeft, double xRight, double yRight){
        super();
        this.xLeft = xLeft;
        this.yLeft = yLeft;
        this.xRight = xRight;
        this.yRight = yRight;
    }
    Rectangle(double xLeft, double yLeft, double xRight, double yRight, int red, int green, int blue){
        super(red, green, blue);
        this.xLeft = xLeft;
        this.yLeft = yLeft;
        this.xRight = xRight;
        this.yRight = yRight;
    }
    void draw(){
        System.out.printf("Нарисован прямоугольник, цвет RGB: red %d, green %d, blue %d\n", super.getColor()[0],
                super.getColor()[1], super.getColor()[2]);
    }
    public String getCenter(){
        double xCenter, yCenter;
        xCenter = (xLeft + xRight) * 0.5;
        yCenter = (yLeft + yRight) * 0.5;
        return String.format("%.2f %.2f",xCenter,yCenter);
    }
    public double getSquare(){
        double sideOne = (Math.abs(xRight - xLeft));
        double sideTwo = (Math.abs(yRight - yLeft));
        return sideOne * sideTwo;
    }
    public double getPerimeter(){
        double sideOne = (Math.abs(xRight - xLeft));
        double sideTwo = (Math.abs(yRight - yLeft));
        return (sideOne + sideTwo) * 2;
    }
}
