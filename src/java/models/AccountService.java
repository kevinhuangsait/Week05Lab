/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author 831719
 */
public class AccountService {
    private ArrayList<User> users;
    
    public AccountService() {
        users = new ArrayList<>();
        users.add(new User("abe", "password"));
        users.add(new User("barb", "password"));
    }
    
    public User login(String username, String password) {
        User user = null;
        
        for (User newUser : users)
        {
            if (newUser.getUsername().equals(username) && newUser.getPassword().equals(password))
            {
                user = new User(username, null);
            }
        }
        return user;
    }
    
    
}
