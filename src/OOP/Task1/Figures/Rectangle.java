package OOP.Task1.Figures;

public class Rectangle implements IShape{
    private double sideA, sideB;
    public Rectangle(){}
    public Rectangle(double sideA, double sideB){

        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public double computeSquare() {
        return sideA * sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
}
