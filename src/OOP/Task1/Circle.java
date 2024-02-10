package OOP.Task1;

public class Circle extends Shape{
    int centerX, centerY;
    double radius;
    Circle(){

    }
    Circle(int centerX, int centerY, double radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }
    Circle(int centerX, int centerY, double radius, int red, int green, int blue){
        super(red, green, blue);
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    void draw(){
        System.out.printf("Нарисован круг, радиус %.1f, цвет RGB: red %d, green %d, blue %d\n", radius, super.getColor()[0],
                super.getColor()[1], super.getColor()[2]);
    }
    double getDiameter(){
        return radius*radius;
    }
}

