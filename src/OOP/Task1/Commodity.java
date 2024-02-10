package OOP.Task1;

public class Commodity {
    String productName;
    int price;
    public void setPrice(int price){
        this.price = price;
    }
    public void show(){
        System.out.printf("""
                Наименование товара: %s           
                Цена товара: %d
                """, productName, price);
    }
}
