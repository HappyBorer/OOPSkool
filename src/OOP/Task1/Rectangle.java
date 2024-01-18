package OOP.Task1;

public class Rectangle {
    double xLeft, yLeft, xRight, yRight;
    Rectangle(double xLeft, double yLeft, double xRight, double yRight){
        this.xLeft = xLeft;
        this.yLeft = yLeft;
        this.xRight = xRight;
        this.yRight = yRight;
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
