package ar.edu.info.unlp.PatronesDeDiseño.ejer12;

import java.util.Comparator;

public class ComparadorFechaElemento implements Comparator<FileSystemElement> {

    @Override
    public int compare(FileSystemElement o1, FileSystemElement o2) {
        return o1.getFechaCreacion().compareTo(o2.getFechaCreacion());}
    
}
