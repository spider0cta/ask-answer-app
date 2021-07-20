package dev.muhammad.askanswerapp;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class AskAnswerAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AskAnswerAppApplication.class, args);
    }

    @Bean
    PrettyTime prettyTime(){
        return new PrettyTime();
    }

}
