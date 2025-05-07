package ar.edu.info.unlp.PatronesDeDiseño.ejer21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MamiferoTest {
	private MamiferoHoja nala;
	private MamiferoHoja melquiades;
	private MamiferoComposite mufasa;
	private MamiferoComposite alexa;
	private MamiferoHoja elsa;
	private MamiferoHoja scar;
	private MamiferoComposite sarabi;
	private MamiferoComposite anonimo;

	@BeforeEach
	void setUp() {
		nala = new MamiferoHoja("Nala");
		melquiades = new MamiferoHoja("Melquiades");
		mufasa = new MamiferoComposite("Mufasa");
		alexa = new MamiferoComposite("Alexa"); 
		elsa = new MamiferoHoja("Elsa");
		scar = new MamiferoHoja("Scar");
		sarabi = new MamiferoComposite("Sarabi");
		anonimo = new MamiferoComposite("anonimo");

		alexa.setPadre(mufasa);
		alexa.setMadre(sarabi);
		mufasa.setPadre(melquiades);
		mufasa.setMadre(nala);
		sarabi.setPadre(scar);
		sarabi.setMadre(elsa);
	}

	@Test
	void testAbuelaMaterna() {
		assertEquals(elsa, alexa.getAbuelaMaterna());
		assertNull(sarabi.getAbuelaMaterna());
		assertNull(elsa.getAbuelaMaterna());
	}

	@Test
	void testAbuelaPaterna() {
		assertEquals(nala, alexa.getAbuelaPaterna());
		assertNull(mufasa.getAbuelaPaterna());
		assertNull(nala.getAbuelaPaterna());
	}

	@Test
	void testAbueloMaterno() {
		assertEquals(scar, alexa.getAbueloMaterno());
		assertNull(sarabi.getAbueloMaterno());
		assertNull(scar.getAbueloMaterno());
	}

	@Test
	void testAbueloPaterno() {
		assertEquals(melquiades, alexa.getAbueloPaterno());
		assertNull(mufasa.getAbueloPaterno());
		assertNull(melquiades.getAbueloPaterno());
	}

	@Test
	void testEspecie() {
		anonimo.setEspecie("Panthera leo");
		assertEquals("Panthera leo", anonimo.getEspecie());
	}

	@Test
	void testIdentificador() {
		anonimo.setIdentificador("Nala");
		assertEquals("Nala", anonimo.getIdentificador());
	}

	@Test
	void testMadre() {
		anonimo.setMadre(alexa);
		assertEquals(alexa, anonimo.getMadre());
		assertNull(nala.getMadre());
	}

	@Test
	void testPadre() {
		anonimo.setPadre(mufasa);
		assertEquals(mufasa, anonimo.getPadre());
		assertNull(nala.getPadre());
	}

	@Test
	void testTieneComoAncestroA() {
		assertFalse(nala.tieneComoAncestroA(anonimo));
		assertFalse(mufasa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(anonimo));
		assertFalse(alexa.tieneComoAncestroA(alexa));
		assertTrue(alexa.tieneComoAncestroA(mufasa));
		assertTrue(alexa.tieneComoAncestroA(sarabi));
		assertTrue(alexa.tieneComoAncestroA(nala));
		assertTrue(alexa.tieneComoAncestroA(melquiades));
		assertTrue(alexa.tieneComoAncestroA(elsa));
		assertTrue(alexa.tieneComoAncestroA(scar));
	}

	@Test
	void testTieneComoAncestroAsimetrico() {
		// Alice -> Aaron -> Anna -> Alexander
		MamiferoComposite alice = new MamiferoComposite("Alice");
		MamiferoComposite aaron = new MamiferoComposite("Aaron");
		MamiferoComposite anna = new MamiferoComposite("Anna");
		MamiferoHoja alexander = new MamiferoHoja("Alexander");

		alice.setPadre(aaron);
		aaron.setMadre(anna);
		anna.setPadre(alexander);

		assertTrue(alice.tieneComoAncestroA(anna));
		assertTrue(alice.tieneComoAncestroA(aaron));
		assertTrue(alice.tieneComoAncestroA(alexander));
		assertFalse(alice.tieneComoAncestroA(nala));
		assertFalse(alice.tieneComoAncestroA(alice));
	}
}