package io.training.service;

import io.training.entity.User;
import io.training.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by percy on 5/25/16.
 */
@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Long create(User user) {
        userRepo.save(user);
        return user.getId();
    }

    public void findAll() {
        Iterable<User> users = userRepo.findAll();
        users.forEach((final User user) ->
                System.out.println(user.getId())
        );
    }
}
