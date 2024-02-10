package OOP.Task1;

public class Table extends Furniture{
    private String type;
    private String material;
    Table(){

    }
    Table(String type, String material){
        this.type = type;
        this.material = material;
    }
    Table(String name, int height, int width, int price, String type, String material){
        super(name, height, width, price);
        this.type = type;
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
