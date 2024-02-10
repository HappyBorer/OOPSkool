package OOP.Task1;

public class Material {
    private String name;
    private int density;

    Material(String name, int density){
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public int getDensity() {
        return density;
    }
}
