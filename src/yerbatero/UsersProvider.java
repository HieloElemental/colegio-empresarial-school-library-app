/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yerbatero;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class UsersProvider {
    private List<User> users;
    
    public UsersProvider() {
        users = new ArrayList<>();
        users.add(new User.Builder()
            .setUsername("admin")
            .setPassword("admin123")
            .setRole("admin")
            .build());
        users.add(new User.Builder()
            .setUsername("user")
            .setPassword("user123")
            .setRole("student")
            .build());
    }
    
    public User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
    
    public List<User> getUsers() {
        return users;
    }
    
    public List<User> getAdmins() {
        List<User> admins = new ArrayList<>();
        for (User user : users) {
            if (user.getRole().equals("admin")) {
                admins.add(user);
            }
        }
        return admins;
    }

    public List<User> getStudents() {
        List<User> students = new ArrayList<>();
        for (User user : users) {
            if (user.getRole().equals("student")) {
                students.add(user);
            }
        }
        return students;
    }
}
