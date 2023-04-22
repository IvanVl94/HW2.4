package com.sky.hw241.HomeWork241;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    User[] users = new User[]{
            new User("qwerty_pro1", "fgrdr4667", "fgrdr4667"),
            new User("qwerty_pro2", "fgrdr4668", "fgrdr4668"),
            new User("qwerty_pro3", "fgrdr4669", "fgrdr4669"),
            new User("qwerty_pro4", "fgrdr4660", "fgrdr4660"),

    };

    @Override
    public String getUser(Integer number) {
        final User user;
        try {

        }
        return null;
    }
}
