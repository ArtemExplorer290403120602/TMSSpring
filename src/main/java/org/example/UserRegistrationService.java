package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserRegistrationService(@Qualifier("inMemoryUserRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void registerUser(String login, String email, String password) {
        User user = new User();
        user.setLogin(login);
        user.setEmail(email);
        user.setPassword(password);

        userRepository.saveUser(user);

        System.out.println("Регистрация прошла успешно для пользователя: " + login);
    }
}
