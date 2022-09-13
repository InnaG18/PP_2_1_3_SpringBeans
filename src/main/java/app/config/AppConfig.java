package app.config;

import app.model.Cat;
import app.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean(name = "cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean(name = "dog")
    public Dog getDog() {
        return new Dog();
    }
}