package OOP.Task1;

public abstract class Shape {
    Color color;
    Shape(){
        color = new Color();
    }
    Shape(int red, int green, int blue){
        color = new Color(red, green, blue);
    }
    abstract void draw();

    int[] getColor(){
        return new int[]{color.getRed(), color.getGreen(), color.getBlue()};
    }

    private class Color{
        private int red, green, blue;
        Color(){}

        Color(int red, int green, int blue){
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public void setRed(int red) {
            this.red = red;
        }

        public void setGreen(int green) {
            this.green = green;
        }

        public void setBlue(int blue) {
            this.blue = blue;
        }

        public int getRed() {
            return red;
        }

        public int getGreen() {
            return green;
        }

        public int getBlue() {
            return blue;
        }
    }
}
