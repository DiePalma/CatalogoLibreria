package models;

import java.util.HashSet;
import java.util.Iterator;

public class Libreria {
    private HashSet<Libro> catalogo;

    public Libreria() {
        this.catalogo = new HashSet<>();
    }

    
    public void agregarLibro(Libro libro){
        if(catalogo.contains(libro)){
            System.out.println("El libro ya está en el catálogo");
        }else{
            catalogo.add(libro);
        }
    }
    public void eliminarLibro(int isbn){
        Iterator<Libro> itera = catalogo.iterator();
        while(itera.hasNext()){
            if (itera.next().hashCode() == isbn) {
                itera.remove();
                break;
            }
        }
    }
    public void mostrarCatalogo(){
        for (Libro libro : catalogo) {
            System.out.println("- "+ libro.getTitulo() + "Autor: "+ libro.getAutor()+"\n");
        }
    }
}
