package ar.edu.info.unlp.PatronesDeDiseño.ejer11;

import java.util.Comparator;

public class ComparadorTamañoElemento implements Comparator<FileSystemElement> {

    @Override
    public int compare(FileSystemElement o1, FileSystemElement o2) {
        return Integer.compare(o1.tamanoTotalOcupado(), o2.tamanoTotalOcupado());
    }
    
}
