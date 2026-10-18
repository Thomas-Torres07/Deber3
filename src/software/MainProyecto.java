package software;

public class MainProyecto {
    public static void main(String[] args) {
        Proyecto miProyecto = new Proyecto();

        System.out.println("--- ASIGNANDO VALORES ---");
        miProyecto.setNombre("Sistema de Inventario");
        miProyecto.setResponsable("Carlos López");
        miProyecto.setProgreso(40);

        System.out.println("Proyecto: " + miProyecto.getNombre());
        System.out.println("Progreso inicial: " + miProyecto.getProgreso() + "%");

        System.out.println("\n--- AVANZANDO PROGRESO ---");
        miProyecto.avanzar(50);
        System.out.println("Progreso tras avanzar 50%: " + miProyecto.getProgreso() + "%");

        miProyecto.avanzar(30); // Intentando superar el 100%
        System.out.println("Progreso tras intentar superar el límite: " + miProyecto.getProgreso() + "%");

        System.out.println("\n--- PROBANDO VALIDACIONES ---");
        miProyecto.setProgreso(-15);
        miProyecto.setProgreso(150);
    }
}
