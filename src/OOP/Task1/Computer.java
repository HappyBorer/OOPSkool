package OOP.Task1;



public class Computer {
    private String type;
    private Screen screen;
    private String country;
    private int yearProduct;
    private int value;
    Computer(){
        screen = new Screen();
    }
    Computer(String type, int horizontal, int upright, String country, int yearProduct, int value){
        this.type = type;
        screen = new Screen(horizontal, upright);
        this.country = country;
        this.yearProduct = yearProduct;
        this.value = value;

    }
    private class Screen{
        private int horizontal;
        private int upright;
        Screen(){}
        Screen(int horizontal, int upright){
            this.horizontal = horizontal;
            this.upright = upright;
        }

        public int getHorizontal() {
            return horizontal;
        }

        public void setHorizontal(int horizontal) {
            this.horizontal = horizontal;
        }

        public int getUpright() {
            return upright;
        }

        public void setUpright(int upright) {
            this.upright = upright;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(int yearProduct) {
        this.yearProduct = yearProduct;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
