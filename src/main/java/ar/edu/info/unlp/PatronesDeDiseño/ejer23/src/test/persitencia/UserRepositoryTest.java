package ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.test.persitencia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.main.persistencia.PersistableUser;
import ar.edu.info.unlp.PatronesDeDiseño.ejer23.src.main.persistencia.UserRepository;

import static org.junit.Assert.assertEquals;


public class UserRepositoryTest {

	@Test
	public void testFindUserByUsername() {
		UserRepository userRepository = new UserRepository();
		
		PersistableUser user = userRepository.findUserByUsername("john_doe");
		assertEquals("john_doe", user.getUsername());
		assertEquals("john.doe@example.com", user.getEmail());

		// Incluir estas condiciones en el test final
		// assertEquals(1, user.getPosts().size());
		// assertTrue(user.getPosts().stream()
		//	.anyMatch(post -> post.getText().equals("¡Acabo de publicar mi primer post!")));
	}

}
