package ca.sait.services;

import ca.servlets.models.User;


/**
 *
 * @author OS
 */
public class AccountService {
    /**
     * Login
     * @param username username
     * @param password password
     * @return user if credentials are correct
     */
    public User login(String username, String password) {
        if (username == null)
            return null;
        
        if (username.equals("abe") && password.equals("password")) {
            User user = new User(username,password);
            return user;
        } else if ("barb".equals(username) && "password".equals(password)) {
            User user = new User(username,password);
            return user;
        } else {
            return null;
        }
    }
}
