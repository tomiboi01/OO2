package ar.edu.info.unlp.ejer1;

import java.util.Set;
import java.util.HashSet;


public class Twitter {
    private Set<User> users;
    
    public Twitter() {
        this.users = new HashSet<User>();
    }

    public boolean addUser(String screenName) {

        return this.users.add(new User(screenName));
    }

    public boolean removeUser(String screenName) {
        if (screenName == null) {
            return false;
        }
        User user = this.users.stream().filter(u -> u.getScreenName().equals(screenName)).findFirst().orElse(null);
        if (user == null)
        {
            return false;
        }
        user.deleteAllTweetsAndRetweets();
        return this.users.remove(user);
    }


}
