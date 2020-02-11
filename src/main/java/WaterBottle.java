public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void drinkWater(){
        this.volume -= 10;
    }

    public void emptyWater(){
    this.volume = 0;
    }

    public void fillBottleWithWater(){
        this.volume = 100;
    }

}
