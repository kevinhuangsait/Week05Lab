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
public class User {
    private String username;
    private String password;

    public User() {
        username = "";
        password = "";
    }
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
