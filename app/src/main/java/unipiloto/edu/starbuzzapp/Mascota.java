package unipiloto.edu.starbuzzapp;

public class Mascota {
    private String nombre;
    private String descripcion;
    private int imagenId;

    public Mascota(String nombre, String descripcion, int imagenId) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagenId = imagenId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagenId() {
        return imagenId;
    }

    @Override
    public String toString() {
        return nombre;
    }
}