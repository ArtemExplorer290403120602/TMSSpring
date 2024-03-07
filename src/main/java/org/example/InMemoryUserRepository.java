package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryUserRepository implements UserRepository{
    @Override
    public void saveUser(User user) {
        System.out.println("Пользователь сохранен в базе данных: " + user.getLogin());
    }
}
