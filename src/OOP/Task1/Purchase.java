package OOP.Task1;

public class Purchase {
    private Commodity commodity;
    private int numberOfUnits;

    Purchase(){}
    Purchase(Commodity commodity, int numberOfUnits){
        this.commodity = commodity;
        this.numberOfUnits = numberOfUnits;
    }
    public String toString(){
        return String.format("%s;%d;%d;%d", commodity.getProductName(), commodity.getPrice(), numberOfUnits, getCost());
    }

    public int getCost(){
        return commodity.getPrice() * numberOfUnits;
    }
    public void show(){
        commodity.show();
        System.out.printf("""
                Количество: %d       
                Стоимость покупки: %d
                """, numberOfUnits, getCost());
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }
}
