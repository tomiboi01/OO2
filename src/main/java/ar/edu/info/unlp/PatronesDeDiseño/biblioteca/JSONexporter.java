package ar.edu.info.unlp.PatronesDeDiseño.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JSONexporter extends VoorheesExporter{

    private String exportar(Socio socio) {
		JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", socio.getNombre());
        jsonObject.put("email", socio.getEmail());
        jsonObject.put("legajo", socio.getLegajo());
        return jsonObject.toJSONString();
	}
    
    @Override
    public String exportar(List<Socio> socios)
    {
        JSONArray jsonArray = new JSONArray();
        jsonArray.addAll(socios.stream().map(this::exportar).toList());
        return jsonArray.toJSONString();
       
        
    }

    
}
