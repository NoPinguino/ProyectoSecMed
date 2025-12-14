package app;
import controller.Controlador;

/**
 * Clase principal del simulador.
 * <p>
 *     Contiene el método {@code main} que actúa como punto de entrada y ejecuta la simulación.
 * </p>
 *
 * @author misael
 * @version 1.0
 */
public class Main {
    /**
     * Método principal de la simulación.
     * <p>
     *     Crea una instancia del controlador e inicia la simulación.
     * </p>
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Controlador simulador = new Controlador();
        simulador.iniciar();
    }
}