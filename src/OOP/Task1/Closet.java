package OOP.Task1;

public class Closet extends Furniture{
    private int volume;
    private String materialOfLoops;
    Closet(){

    }
    Closet(int volume, String materialOfLoops){
        this.volume = volume;
        this.materialOfLoops = materialOfLoops;
    }
    Closet(String name, int height, int width, int price, int volume, String materialOfLoops){
        super(name, height, width, price);
        this.volume = volume;
        this.materialOfLoops = materialOfLoops;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMaterialOfLoops() {
        return materialOfLoops;
    }

    public void setMaterialOfLoops(String materialOfLoops) {
        this.materialOfLoops = materialOfLoops;
    }
}
