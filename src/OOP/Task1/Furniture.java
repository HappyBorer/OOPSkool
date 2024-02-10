package OOP.Task1;

public class Furniture {
    private String name;
    private Dimensions dimensions;
    private int price;

    Furniture(){
        dimensions = new Dimensions();
    }
    Furniture(String name, int height, int width, int price){
        this.name = name;
        dimensions = new Dimensions(height, width);
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public class Dimensions{
        private int height, width;
        Dimensions(){

        }
        Dimensions(int height, int width){
            this.height = height;
            this.width = width;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }
}
