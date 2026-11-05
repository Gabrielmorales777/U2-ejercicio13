public class LectorTarjetas {
    private ControladorDeAcceso controlador;

    public LectorTarjetas(ControladorDeAcceso controlador) {
        this.controlador = controlador;
    }

    public void leerTarjeta(TarjetaRFID tarjeta, String zona) {
        System.out.println("Lector: tarjeta detectada.");
        System.out.println("Código: " + tarjeta.getCodigo());
        System.out.println("Zona solicitada: " + zona);

        boolean autorizado =
                controlador.verificarAcceso(tarjeta, zona);

        if (autorizado) {
            System.out.println("Puerta abierta.");
        } else {
            System.out.println("Puerta cerrada.");
        }

        System.out.println();
    }
}