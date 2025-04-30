package ar.edu.info.unlp.PatronesDeDiseño.ejer17;

import java.lang.reflect.Proxy;
import java.util.Collection;
import java.util.List;

;

public class ProxyDB implements DatabaseAccess {
    private DatabaseRealAccess db;

    public ProxyDB() {
        this.db = new DatabaseRealAccess();
    }

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (this.checkAcess()) {
            return db.getSearchResults(queryString);
        } else {
            System.out.println("No tiene acceso a la base de datos");
            return null;
        }
    }

    @Override
    public int insertNewRow(List<String> rowData) {
        if (this.checkAcess()) {
            return db.insertNewRow(rowData);
        } else {
            System.out.println("No tiene acceso a la base de datos");
            return -1;
        }
    }

    private boolean checkAcess() {
        return true;
    }

    //
    
}
