public class HotDrinkTemperature extends HotDrink {

    private int temperature;

    

    public HotDrinkTemperature(String name, int volume, int temperature) {

        super(name, volume);

        this.temperature = temperature;

    }

    

    public int gettemperature() {

        return temperature;

    }

    

    public void settemperature(int temperature) {

        this.temperature = temperature;

    }

}