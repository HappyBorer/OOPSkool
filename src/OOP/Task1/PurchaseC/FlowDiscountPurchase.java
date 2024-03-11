package OOP.Task1.PurchaseC;

public class FlowDiscountPurchase extends Purchase {
    private static int minAmount;
    private static double discount;
    FlowDiscountPurchase(){}
    FlowDiscountPurchase(Commodity commodity){
        super(commodity);
    }
    FlowDiscountPurchase(Commodity commodity , int numberOfUnits){
        super(commodity, numberOfUnits);
    }
    public int getCost(){
        if(super.getNumberOfUnits() >= minAmount){
            return super.getCost() - (int)(discount * super.getCost());
        }
        return super.getCost();
    }
    public String toString(){
        return super.getCommodity().getProductName() + ";" + super.getCommodity().getPrice() + ";" + super.getNumberOfUnits() +
                ";" + discount + ";" + minAmount + ";" + getCost();
    }

    public static double getDiscount() {
        return discount;
    }

    public static void setDiscount(double discount) {
        FlowDiscountPurchase.discount = discount;
    }

    public static int getMinAmount() {
        return minAmount;
    }

    public static void setMinAmount(int minAmount) {
        FlowDiscountPurchase.minAmount = minAmount;
    }
}
