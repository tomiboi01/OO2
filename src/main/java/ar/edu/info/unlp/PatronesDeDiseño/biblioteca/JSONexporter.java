package ar.edu.info.unlp.PatronesDeDiseño.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;


public class JSONexporter {

    private String exportar(Socio s)
    {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("nombre", s.getNombre());
        jsonObject.put("email", s.getEmail());
        jsonObject.put("legajo", s.getLegajo());
        return jsonObject.toJSONString();
    }

    public String exportar(List<Socio> socios)
    {
        JSONArray jsonArray = new JSONArray();
        jsonArray.addAll(socios.stream().map(this::exportar).toList());
        return jsonArray.toJSONString();
       
        
    }

    
}
