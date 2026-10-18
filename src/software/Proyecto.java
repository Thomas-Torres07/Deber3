package software;

public class Proyecto {
    private String nombre;
    private int progreso;
    private String responsable;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProgreso() {
        return progreso;
    }

    public void setProgreso(int progreso) {
        if (progreso >= 0 && progreso <= 100) {
            this.progreso = progreso;
        } else {
            System.out.println("Error: El progreso debe estar entre 0 y 100.");
        }
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public void avanzar(int porcentaje) {
        if (porcentaje > 0) {
            this.progreso += porcentaje;
            if (this.progreso > 100) {
                this.progreso = 100;
            }
        }
    }
}