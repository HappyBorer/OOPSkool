package OOP.Task1.PurchaseC;

import java.util.Objects;

public class Commodity {
    private String productName;
    private int price;
    Commodity(){

    }
    Commodity(String productName, int price){
        this.productName = productName;
        this.price = price;
    }

    public String toString(){
        return String.format("%s;%d", productName, price);
    }
    public void show(){
        System.out.printf("""
                Наименование товара: %s           
                Цена товара: %d
                """, productName, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return price == commodity.price && Objects.equals(productName, commodity.productName);
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        int c = Integer.hashCode(price);
        return 31 * result + c;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
