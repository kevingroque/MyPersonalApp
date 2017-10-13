package app.roque.com.mypersonalapp.repository;


import java.util.ArrayList;
import java.util.List;

import app.roque.com.mypersonalapp.model.User;

public class UserRepository {

    public static List<User> users = new ArrayList<>();

    static{
        users.add(new User(100, "ebenites", "tecsup"));
        users.add(new User(200, "jfarfan", "tecsup"));
        users.add(new User(300, "drodriguez", "tecsup"));
    }

    public static User login(String username, String password){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User addUser(String username, String password){
        for(int i = 400; i<=9999;i+=100){
            users.add(new User(i,username,password));
        }
        return login(username,password);
    }

    public static User getUser(String username){
        for (User user : users){
            if(user.getUsername().equalsIgnoreCase(username)){
                return user;
            }
        }
        return null;
    }

}
