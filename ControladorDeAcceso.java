import java.util.HashMap;
import java.util.Map;

public class ControladorDeAcceso {
    private Map<String, Integer> permisos;

    public ControladorDeAcceso() {
        permisos = new HashMap<>();

        // Zona y nivel mínimo de acceso requerido
        permisos.put("Recepcion", 1);
        permisos.put("Oficinas", 2);
        permisos.put("SalaServidor", 3);
    }

    public boolean verificarAcceso(TarjetaRFID tarjeta, String zona) {
        System.out.println("Controlador: verificando credencial...");

        Integer nivelRequerido = permisos.get(zona);

        if (nivelRequerido == null) {
            System.out.println("Zona inexistente.");
            return false;
        }

        if (tarjeta.getNivelAcceso() >= nivelRequerido) {
            System.out.println("Acceso autorizado.");
            return true;
        }

        System.out.println("Acceso denegado: nivel insuficiente.");
        return false;
    }
}