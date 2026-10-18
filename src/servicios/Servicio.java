package servicios;

public class Servicio {
    private String nombre;
    private int puerto;
    private boolean activo;
    private int cantidadPeticiones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        if (puerto > 0) {
            this.puerto = puerto;
        } else {
            System.out.println("Error: El puerto debe ser mayor que 0.");
        }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getCantidadPeticiones() {
        return cantidadPeticiones;
    }

    public void setCantidadPeticiones(int cantidadPeticiones) {
        if (cantidadPeticiones >= 0) {
            this.cantidadPeticiones = cantidadPeticiones;
        } else {
            System.out.println("Error: La cantidad de peticiones no puede ser negativa.");
        }
    }

    public void iniciar() {
        this.activo = true;
    }

    public void detener() {
        this.activo = false;
    }

    public void registrarPeticion() {
        this.cantidadPeticiones++;
    }
}
