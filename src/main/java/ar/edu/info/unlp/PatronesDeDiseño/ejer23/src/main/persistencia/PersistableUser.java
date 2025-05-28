package ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.main.persistencia;

import java.util.List;

public interface PersistableUser {

	public String getUsername();

	public String getEmail();

	public List<Post> getPosts();

}
