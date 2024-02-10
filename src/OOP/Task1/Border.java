package OOP.Task1;

public class Border {
    private int lineThickness;
    private String lineStyle;

    private Color color;
    Border(){
        lineThickness = 10;
        lineStyle = "solid";
        color = new Color();
    }
    Border(int lineThickness, String lineStyle, short red, short green, short blue){
        this.lineThickness = lineThickness;
        this.lineStyle = lineStyle;
        color = new Color(red, green, blue);
    }



    public int getLineThickness() {
        return lineThickness;
    }

    public void setLineThickness(int lineThickness) {
        this.lineThickness = lineThickness;
    }

    public String getLineStyle() {
        return lineStyle;
    }

    public void setLineStyle(String lineStyle) {
        this.lineStyle = lineStyle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    private class Color {
        private short red, green, blue;
        Color(){
            red = 255;
            green = 255;
            blue = 255;
        }
        Color(short red, short green, short blue){
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public short getRed() {
            return red;
        }

        public void setRed(short red) {
            this.red = red;
        }

        public short getGreen() {
            return green;
        }

        public void setGreen(short green) {
            this.green = green;
        }

        public short getBlue() {
            return blue;
        }

        public void setBlue(short blue) {
            this.blue = blue;
        }
    }

}
