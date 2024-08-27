package com.skapachatt.skapachatt.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.skapachatt.skapachatt.models.User;

@Service
public class UserService {

    private final MongoOperations mongoOperations;

    public UserService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public List<User> getUsers() {
        return mongoOperations.findAll(User.class);
    }

    public User addUser(User user) {
        return mongoOperations.insert(user);
    }
}
