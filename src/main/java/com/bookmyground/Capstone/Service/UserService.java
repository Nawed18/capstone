package com.bookmyground.Capstone.Service;

import com.bookmyground.Capstone.Entity.System_user;
import com.bookmyground.Capstone.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public System_user.User register(System_user.User user){
        return userRepository.save(user);
    }
}
