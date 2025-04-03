package Tps;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina (int getIdGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0;
    }

    public int getIdGallina() {
        return  idGallina;
    }

    public int getEdad(){
        return edad;
    }
    public int getHuevosPuestos() {
        return huevosPuestos;
    }
    public void ponerHuevo(){
        huevosPuestos++;
    }
    public void envejecer(){
        edad++;
    }
    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + "Edad: "+ edad+"años, Huevos puestos: "+ huevosPuestos);
    }

}
