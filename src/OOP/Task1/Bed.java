package OOP.Task1;

public class Bed extends Furniture{
    private boolean isOrthopedicGrill;
    private String typeOfFastening;
    Bed(){
        isOrthopedicGrill = false;
    }
    Bed(String typeOfFastening, boolean isOrthopedicGrill){
        this.typeOfFastening = typeOfFastening;
        this.isOrthopedicGrill = isOrthopedicGrill;
    }
    Bed(String name, int height, int width, int price, String typeOfFastening, boolean isOrthopedicGrill){
        super(name, height, width, price);
        this.typeOfFastening = typeOfFastening;
        this.isOrthopedicGrill = isOrthopedicGrill;
    }

    public boolean isOrthopedicGrill() {
        return isOrthopedicGrill;
    }

    public void setOrthopedicGrill(boolean orthopedicGrill) {
        isOrthopedicGrill = orthopedicGrill;
    }

    public String getTypeOfFastening() {
        return typeOfFastening;
    }

    public void setTypeOfFastening(String typeOfFastening) {
        this.typeOfFastening = typeOfFastening;
    }
}
