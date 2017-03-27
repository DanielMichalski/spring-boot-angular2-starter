package pl.dmichalski.backend;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        List<String> v = new ArrayList<>();
        v.add("s");
        v.add("2");

        v.forEach(System.out::println);


//        SpringApplication.run(Application.class, args);
    }
}