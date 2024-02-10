package OOP.Task1;

public class Thing {
    private String name;
    private Material material;
    private double volume;
    Thing(){

    }
    Thing(String name, Material material, double volume){
        this.name = name;
        this.material = material;
        this.volume = volume;
    }
    public double getMass(){
        return volume * material.getDensity();
    }
    public void show(){
        System.out.printf("%s;%s;%d;%.2f;%.1f\n", name, material.getName(), material.getDensity(), volume, getMass());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
