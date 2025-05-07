package ar.edu.unlp.oo2.persitencia;

import java.util.List;

public class UserProxy extends User {

    public UserProxy(String aUsername, String anEmail) {
        super(aUsername, anEmail);
    }

    @Override
    public List<Post> getPosts() {
        if (this.getPosts() == null) 
        {
            PostRepository postRepository = new PostRepository();
            this.posts = postRepository.findPostsByUsername(this.getUsername());
            return this.posts;
        } 
        else 
            return super.getPosts();
        
    }
}