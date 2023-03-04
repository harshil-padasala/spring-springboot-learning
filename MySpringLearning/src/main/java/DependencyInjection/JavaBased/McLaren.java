package DependencyInjection.JavaBased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mc")
public class McLaren {
    @Value("McLaren GT 10")
    private String carName;

    @Value("100")
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
}
