public class Main {
    public static void main(String[] args) {

        ControladorDeAcceso controlador =
                new ControladorDeAcceso();

        LectorTarjetas lector =
                new LectorTarjetas(controlador);

        // Tarjeta válida para la zona solicitada
        TarjetaRFID tarjetaValida =
                new TarjetaRFID("RFID001", 3);

        // Tarjeta con nivel insuficiente
        TarjetaRFID tarjetaInvalida =
                new TarjetaRFID("RFID002", 1);

        System.out.println("=== PRUEBA 1 ===");
        lector.leerTarjeta(tarjetaValida, "SalaServidor");

        System.out.println("=== PRUEBA 2 ===");
        lector.leerTarjeta(tarjetaInvalida, "SalaServidor");
    }
}