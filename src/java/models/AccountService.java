/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author 831719
 */
public class AccountService {
    private String username;
    private String password;

    public AccountService() {
        username = "";
        password = "";
    }
    
    public AccountService(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public User login(String username, String password) {
        if(username.equals("abe") && password.equals("password"))
        {
            User user = new User(username, null);
            return user;
        }
        else if(username.equals("barb") && password.equals("password"))
        {
            User user = new User(username, null);
            return user;
        }
        else
        {
            return null;
        }
    }
    
    
}
