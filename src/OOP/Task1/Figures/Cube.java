package OOP.Task1.Figures;

public class Cube implements IShape{
    private double sideA, sideB, sideC;

    public Cube(){}
    public Cube(double side){
        this.sideA = side;
        this.sideB = side;
        this.sideC = side;
    }
    @Override
    public double computeSquare() {
        return (sideA*sideB + sideB * sideC + sideA * sideC) * 2;
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

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
