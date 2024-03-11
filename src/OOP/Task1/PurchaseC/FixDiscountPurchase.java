package OOP.Task1.PurchaseC;

public class FixDiscountPurchase extends Purchase {
    private static double discount;

    FixDiscountPurchase(){

    }
    FixDiscountPurchase(Commodity commodity){
        super(commodity);
    }
    FixDiscountPurchase(Commodity commodity, int numberOfUnits){
        super(commodity, numberOfUnits);
    }

    public int getCost(){
        return super.getCost() - (int)(super.getCost() * discount);
    }

    public String toString(){
        return super.getCommodity().getProductName() + ";" + super.getCommodity().getPrice() + ";" + super.getNumberOfUnits() +
                ";" + discount + ";" + getCost();
    }

    public double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FixDiscountPurchase.discount = discount;
    }
}
