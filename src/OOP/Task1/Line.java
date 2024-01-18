package OOP.Task1;

public class Line {
    double x1, y1, z1, x2, y2, z2;
    public double lengthSegment(){
        return Math.abs(Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1,2)));
    }

}
