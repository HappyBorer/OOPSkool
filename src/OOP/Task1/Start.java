package OOP.Task1;


import OOP.Task1.EducationDepartment.Learner;
import OOP.Task1.EducationDepartment.Schoolboy;
import OOP.Task1.EducationDepartment.Student;
import OOP.Task1.Figures.Cube;
import OOP.Task1.Figures.IShape;
import OOP.Task1.Figures.Rectangle;
import OOP.Task1.Pats.Cat;
import OOP.Task1.Pats.Dog;
import OOP.Task1.Pats.Pat;


import java.util.Scanner;


public class Start {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        IShape[] iShapes = new IShape[size];
        for(int i = 0; i < iShapes.length; i++){
            int numberIShapes = input.nextInt();
            switch (numberIShapes){
                case 1:
                    iShapes[i] = new Rectangle(input.nextDouble(), input.nextDouble());
                    break;
                case 2:
                    iShapes[i] = new Cube(input.nextDouble());
                    break;
                default:
                    iShapes[i] = null;
            }
        }


        for (IShape iShape : iShapes) {
            System.out.printf("%.2f ", iShape.computeSquare());

        }
        System.out.println();
        int indexMax = 0;
        Rectangle maxRec = null;
        for (int i = 0; i < iShapes.length; i++) {
            if(iShapes[i] instanceof Rectangle rectangle){
                if(maxRec == null){
                    maxRec = rectangle;
                }
                if(rectangle.computeSquare() > maxRec.computeSquare()){
                   maxRec = rectangle;

                }
            }
        }
        if(maxRec != null){
            System.out.printf("Прямоугольник сторона 1 = %.2f, сторона 2 = %.2f Площадь = %.2f%n", maxRec.getSideA(),
                    maxRec.getSideB(), maxRec.computeSquare());
        }else{
            System.out.println("ERROR");
        }

    }
}

