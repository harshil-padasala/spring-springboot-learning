package DependencyInjection.JavaBased;

public class Engine {
    private String type;
    private float volume;
    private float horsepower;

    public Engine(String type, float volume, float horsepower) {
        this.type = type;
        this.volume = volume;
        this.horsepower = horsepower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(float horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", volume=" + volume + " liter " +
                ", horsepower=" + horsepower +
                '}';
    }
}
