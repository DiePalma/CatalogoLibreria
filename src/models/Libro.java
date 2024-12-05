package models;

public class Libro {
    String titulo;
    String autor;
    int isbn;
    public Libro() {
    }


    
    public Libro(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }



    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    // public int getIsbn() {
    //     return isbn;
    // }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    @Override
    public int hashCode() {
        return isbn;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn != other.isbn)
            return false;
        return true;
    }
    
}
