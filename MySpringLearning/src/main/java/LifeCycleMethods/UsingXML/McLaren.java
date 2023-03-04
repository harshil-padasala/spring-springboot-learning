package LifeCycleMethods.UsingXML;

import java.util.List;

public class McLaren {
    private String carName;
    private long prize;

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        System.out.println("Setting Property Name");
        this.carName = carName;
    }

    public long getPrize() {
        return prize;
    }

    public void setPrize(long prize) {
        System.out.println("Setting Property Prize");
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "McLaren{" +
                "carName='" + carName + '\'' +
                ", prize=" + prize +
                '}';
    }

    public void init() {
        System.out.println("Car is Produced. And ready for Sale.😊😊");
    }

    public void destroy() {
        System.out.println("Car is Destroyed. And we are buying a new Car. Yahoo🎉🎉🎉");
    }
}
