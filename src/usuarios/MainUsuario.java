package usuarios;

public class MainUsuario {
    public static void main(String[] args) {
        // 1. Instanciar el objeto usando el constructor por defecto
        Usuario miUsuario = new Usuario();

        System.out.println("--- ASIGNANDO VALORES VÁLIDOS ---");
        // 2. Usar los setters para guardar la información
        miUsuario.setUsername("dev_admin");
        miUsuario.setCorreo("admin@sistema.com");
        miUsuario.setNivel(3);
        miUsuario.activar(); // Cambia el estado

        // 3. Usar los getters para mostrar la información almacenada
        System.out.println("Username: " + miUsuario.getUsername());
        System.out.println("Correo: " + miUsuario.getCorreo());
        System.out.println("Nivel: " + miUsuario.getNivel());
        System.out.println("Estado activo: " + miUsuario.isActivo());

        System.out.println("\n--- PROBANDO LAS VALIDACIONES (ERRORES) ---");
        // 4. Provocar errores intencionales para ver si los setters los bloquean
        miUsuario.setUsername("");
        miUsuario.setNivel(-5);

        System.out.println("\n--- VERIFICANDO QUE LOS DATOS NO CAMBIARON POR EL ERROR ---");
        System.out.println("Username sigue siendo: " + miUsuario.getUsername());
        System.out.println("Nivel sigue siendo: " + miUsuario.getNivel());
    }
}