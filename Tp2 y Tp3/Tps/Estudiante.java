package Tps;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public String getCurso() {
        return curso;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInfo(){
        System.out.println("nombre:"+nombre + ", apellido:"+ apellido + ", Curso:" + curso + ", Calificacion:" + calificacion);
    }

    public void subirCalificacion(double puntos){
        if (calificacion + puntos <= 10 ){
            calificacion = calificacion + puntos;
        }
        else {calificacion = 10.0;
        }
    }

    public void BajarCalificacion(double puntos) {
        if (calificacion + puntos >= 0) {
            calificacion = calificacion - puntos;
        } else {
            calificacion = 0;
        }

    }}