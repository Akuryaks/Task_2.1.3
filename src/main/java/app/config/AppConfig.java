package app.config;

import app.model.AnimalsCage;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {
    @Bean(name = "dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean(name = "animals_cage")
    public AnimalsCage getAnimalCage() {
        return new AnimalsCage(getTimer());
    }

    @Bean(name = "timer")
    public Timer getTimer() {
        return new Timer();
    }
}
