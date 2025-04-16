package Tps;

import java.time.Year;

public class Libro {
    private String titulo;
    private  String autor;
    private int añoPublicacion;

    public Libro(String titulo, String autor, int añoPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        setAñoPublicacion(añoPublicacion);
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAñoPublicacion(){
        return añoPublicacion;
    }

    public void setAñoPublicacion(int nuevoAño) {
        int añoActual = Year.now().getValue();
        if (nuevoAño >= 1990 && nuevoAño <= añoActual){
            this.añoPublicacion = nuevoAño;
        } else{
            System.out.println("Año inválido: " + nuevoAño + ". Debe estar entre 1900 y " + añoActual);
        }
    }
    public void mostrarInfo(){
        System.out.println("Título: " + titulo + ", Autor: " + autor + ",  Año de Publicación: " + añoPublicacion);
    }
}

