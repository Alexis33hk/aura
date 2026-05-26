package org.example.MODEL;


public class libro {

    private int libroId;
    private String titulo;
    private String genero;
    private int autorId;

    public libro() {
    }

    public libro(int libroId, String titulo, String genero, int autorId) {
        this.libroId = libroId;
        this.titulo = titulo;
        this.genero = genero;
        this.autorId = autorId;
    }

    public int getLibroId() {
        return libroId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

}
