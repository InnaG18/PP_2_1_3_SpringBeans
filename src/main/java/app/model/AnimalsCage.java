package app.model;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Getter
@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("cat")
    private Animal cat;

    @Autowired
    @Qualifier("dog")
    private Animal dog;

    @Autowired
    private Timer timer;

    public AnimalsCage(Animal cat, Animal dog, Timer timer) {
        this.cat = cat;
        this.dog = dog;
        this.timer = timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(cat.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}