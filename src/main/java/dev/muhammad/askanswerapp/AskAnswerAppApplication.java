package dev.muhammad.askanswerapp;

import org.ocpsoft.prettytime.PrettyTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@SpringBootApplication
@EnableTransactionManagement
public class AskAnswerAppApplication {

    private static final Logger log = LoggerFactory.getLogger(AskAnswerAppApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AskAnswerAppApplication.class, args);
    }

    @Bean
    PrettyTime prettyTime() {
        return new PrettyTime();
    }

    @Bean
    public SpringSecurityDialect securityDialect() {
        return new SpringSecurityDialect();
    }

    @Bean
    public JavaMailSender javaMailSender(){
        return new JavaMailSenderImpl();
    }
}