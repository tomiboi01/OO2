package ar.edu.info.unlp.ejersDeRepaso.ejer1;

import java.util.Set;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Twitter {
    private Set<User> users;
    
    public Twitter() {
        this.users = new HashSet<User>();
    }

    public User addUser(String screenName) {
        if (screenName == null) {
            return null;
        }
        User user = new User(screenName);
        if (!this.users.add(user)) {
            return null;
        }
        return user;
    }

    public boolean deleteUser(String screenName) {
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

    public User getUser( String screenName)
    {
        return this.users.stream().filter(u -> u.getScreenName().equals(screenName)).findFirst().orElse(null);
    }

    public Stream<User> getUsers()
    {
        return this.users.stream();
    }


}
