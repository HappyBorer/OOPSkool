package OOP.Task1;

public class Chair extends Furniture{
    private String type;
    private double load;
    Chair(){
    }
    Chair(String type, double load){
        this.type = type;
        this.load = load;
    }
    Chair(String name, int height, int width, int price, String type, double load){
        super(name, height, width, price);
        this.type = type;
        this.load = load;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }
}
