package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class MainApplication {

    @Bean
    public UserRepository userRepository() {
        return new InMemoryUserRepository();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
        UserService registrationServis = context.getBean(UserService.class);
        registrationServis.registerUser("Artem","artem@mail.ru","12345yt");
    }
}
