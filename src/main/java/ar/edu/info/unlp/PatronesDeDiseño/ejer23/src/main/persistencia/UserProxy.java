package ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.main.persistencia;

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
        System.out.println("Cargando posts de " + this.getUsername() + " desde la base de datos...");
        
    }
}