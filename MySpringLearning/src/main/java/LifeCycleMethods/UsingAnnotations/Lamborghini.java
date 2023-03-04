package LifeCycleMethods.UsingAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Lamborghini {
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
        return "Lamborghini{" +
                "carName='" + carName + '\'' +
                ", prize=" + prize +
                '}';
    }

    @PostConstruct      // For Init method
    public void start() {
        System.out.println("Car " + this.carName + " is Produced. And ready for Sale.😊😊");
    }

    @PreDestroy         // For Destroy Method
    public void end() {
        System.out.println("Car " + this.carName + " is Destroyed. And we are buying a new Car. Yahoo🎉🎉🎉");
    }
}
