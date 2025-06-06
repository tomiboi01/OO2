package ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.test.persitencia;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.main.persistencia.PostRepository;

public class PostRepositoryTest {

	@Test
	public void testFindPostsByUsername() {
		PostRepository postRepository = new PostRepository();
		
		assertEquals(2 , postRepository.findPostsByUsername("jane_smith").size());
		assertTrue(postRepository.findPostsByUsername("jane_smith").stream()
				.anyMatch(post -> post.getText().equals("Hoy es un gran día.")));
		assertTrue(postRepository.findPostsByUsername("jane_smith").stream()
				.anyMatch(post -> post.getText().equals("Compartiendo algunas fotos del viaje reciente.")));
		
		assertEquals(1 , postRepository.findPostsByUsername("john_doe").size());
		assertTrue(postRepository.findPostsByUsername("john_doe").stream()
				.anyMatch(post -> post.getText().equals("¡Acabo de publicar mi primer post!")));
	}

}
