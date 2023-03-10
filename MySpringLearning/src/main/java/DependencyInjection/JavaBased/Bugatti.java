package DependencyInjection.JavaBased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bugatti implements InitializingBean, DisposableBean {
    private String carName;
    private long prize;

    public Bugatti(String carName, long prize) {
        this.carName = carName;
        this.prize = prize;
    }

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
        return "Bugatti{" +
                "carName='" + carName + '\'' +
                ", prize=" + prize +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Car " + this.carName + " is Produced. And ready for Sale.ðð");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Car " + this.carName + " is Destroyed. And we are buying a new Car. Yahooððð");
    }
}
