package ar.edu.info.unlp.PatronesDeDiseño.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaJSON {
	private List<Socio> socios;
	private JSONexporter exporter;

	public BibliotecaJSON() {
		socios = new ArrayList<>();
		exporter= new JSONexporter(); 
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public JSONexporter getExporter() {
		return exporter;
	}

	public void setExporter(JSONexporter exporter) {
		this.exporter = exporter;
	}
}

