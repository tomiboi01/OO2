package ar.edu.info.unlp.ejersDeRepaso.ejer1;

public abstract class Post {
    User user;

    public User getUser() {
        return this.user;

    }

    public Post(User user) {
        this.user = user;
    }
}
