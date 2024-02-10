package OOP.Task1;

public class Purchase {
    Commodity commodity;
    int numberOfUnits;

    private int getCost(){
        return commodity.price * numberOfUnits;
    }
    public void show(){
        commodity.show();
        System.out.printf("""
                Количество: %d       
                Стоимость покупки: %d
                """, numberOfUnits, getCost());
    }
}
