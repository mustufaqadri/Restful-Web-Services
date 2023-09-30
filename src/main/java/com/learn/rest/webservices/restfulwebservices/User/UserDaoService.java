package com.learn.rest.webservices.restfulwebservices.User;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount, "Mustufa", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Salman", LocalDate.now().minusYears(20)));
        users.add(new User(++usersCount, "Saif", LocalDate.now().minusYears(10)));
    }

    public List<User> findAll() {
        return users;
    }

    public User findOne(Integer userId) {
        User user = users.stream().filter(u -> u.getId() == userId).findFirst().orElse(null);
        return user;
    }

    public Boolean deleteUser(Integer userId) {
        Boolean isDeleted = users.removeIf(u -> u.getId() == userId);
        return isDeleted;
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);

        return user;
    }
}
