package servicios;

public class MainServicio {
    public static void main(String[] args) {
        Servicio miServicio = new Servicio();

        System.out.println("--- CONFIGURANDO SERVICIO ---");
        miServicio.setNombre("API de Pagos");
        miServicio.setPuerto(8080);
        miServicio.setCantidadPeticiones(0);

        System.out.println("Servicio: " + miServicio.getNombre());
        System.out.println("Puerto: " + miServicio.getPuerto());

        System.out.println("\n--- ESTADO DEL SERVICIO ---");
        miServicio.iniciar();
        System.out.println("¿Servicio activo?: " + miServicio.isActivo());

        System.out.println("\n--- REGISTRANDO PETICIONES ---");
        miServicio.registrarPeticion();
        miServicio.registrarPeticion();
        miServicio.registrarPeticion();
        System.out.println("Peticiones registradas: " + miServicio.getCantidadPeticiones());

        System.out.println("\n--- PROBANDO VALIDACIONES ---");
        miServicio.setNombre("");
        miServicio.setPuerto(0);
        miServicio.setCantidadPeticiones(-5);
    }
}