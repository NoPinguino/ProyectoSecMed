package model.entities;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa el historial médico de un paciente.
 * <p>
 *     Clase que contiene la colección de entradas del historial médico de un paciente y los métodos para gestionar
 *     dichas entradas.
 * </p>
 */
public class HistorialMedico {
    private List<EntradaHistorial> entradas;

    /**
     * Construye un objeto {@code HistorialMedico} vacio
     */
    public HistorialMedico() {
        this.entradas = new ArrayList<>();
    }


    public List<Receta> obtenerRecetaPorMedico(Paciente paciente, String idMedicoBuscado) {
        List<Receta> recetasPorMedico = new ArrayList<>();
        for (EntradaHistorial entrada : entradas) {
            if (entrada.getTipo().equals("Receta") && entrada.getIdMedico().equals(idMedicoBuscado)) {
                recetasPorMedico.add((Receta) entrada);
            }
        }
        return recetasPorMedico;
    }

    public List<Analisis> obtenerAnalisisDeHistorial(Paciente paciente) {
        List<Analisis> listaAnalisis = new ArrayList<>();
        for (EntradaHistorial entrada : entradas) {
            if (entrada.getTipo().equals("Analisis")) {
                listaAnalisis.add((Analisis) entrada);
            }
        }
        return listaAnalisis;
    }


    /**
     * Devuelve la lista de entradas en el historial de un paciente.
     *
     * @return Lista de entradas en el historial médico de un paciente
     */
    public List<EntradaHistorial> getEntradas() {
        return entradas;
    }

    /**
     * Agrega una entrada en el historial médico de un paciente.
     *
     * @param entradaHistorial Entrada a agregar.
     */
    public void agregarEntrada(EntradaHistorial entradaHistorial) {
        entradas.add(entradaHistorial);
    }

    /**
     * Devuelve una representación de la instancia del objeto en forma de texto.
     *
     * @return representación de objeto {@code HistorialMedico}
     */
    @Override
    public String toString() {
        return  "Objeto HistorialMedico {\n" +
                " entradas = '" + entradas + "'\n" +
                "} \n";
    }
}
