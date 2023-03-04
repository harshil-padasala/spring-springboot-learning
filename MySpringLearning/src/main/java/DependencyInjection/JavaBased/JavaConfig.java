package DependencyInjection.JavaBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

@Configuration
@ComponentScan(basePackages = "DependencyInjection.JavaBased")
public class JavaConfig {

    @Bean
    public Engine getEngine() {
        return new Engine("IC Engine", 1.5F, 111);
    }

    @Bean(name = {"sw", "swif", "swift"})
    public Swift getSwift() {
        return new Swift(getEngine());
    }

    @Bean
    public Bugatti getBugatti() {
        return new Bugatti("Bugatti Veyron", 100);
    }

}
