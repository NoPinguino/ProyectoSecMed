package controller;

import model.entities.*;
import model.enums.*;
import view.Vista;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * Controlador principal de la aplicación.
 * <p>
 *     Se encarga de la creación de usuarios y pacientes, la asignación de médicos y pruebas médicas, y la comunicación
 *     con la vista.
 * </p>
 */
public class Controlador {
    /**
     * Inicia la simulación.
     * <p>
     *     Crea instancias de administrativos, médicos y pacientes, estableciendo las relaciones entre ellos,
     *     realizando pruebas y mostrando el resultado a través de la vista.
     * </p>
     */
    public void iniciar() {
        Vista miVista = new Vista();

        // Crear Admin y Médico
        Administrativo testAdmin1 = new Administrativo("myAdmin","123456789A","myadmin.@hospital.com","c/Almíbar 12", "user.myAdmin","passadmin","sal","idAdmin_001");
        Medico testMedico1 = new Medico("Doctor Carrero","123456789B","doctores.carrero@hospital.com","c/Almíbar 13", "user.docCarre","passdoc","sal","nCol_001", Especialidad.OTORRINOLARINGOLOGIA);
        // Imprimir Admin y Médico
        miVista.imprimir("\n--- Usuarios creados ---");
        miVista.imprimir(testAdmin1.toString());
        miVista.imprimir(testMedico1.toString());

        // Crear Paciente
        Paciente testPaciente1 = new Paciente("Misael","123456789C","misael.correo@gmail.com","c/Almíbar 14");
        // Imprimir Paciente
        miVista.imprimir("\n--- Paciente creado ---");
        miVista.imprimir(testPaciente1.toString());

        // Asigno la relación médico paciente con el usuario Administrador
        testAdmin1.asignarMedico(testPaciente1,testMedico1);

        // Creo historial de Paciente
        PruebaMedica testPruebaMedica1 = new PruebaMedica(LocalDate.now(),testMedico1.getNumeroColegiado(),"Dolor en los oídos", TipoPrueba.PRUEBA_ESFUERZO,"Oídos inflamados");
        Receta testReceta1 = new Receta(LocalDate.now(),testMedico1.getNumeroColegiado(),"Dolor en los oídos", Arrays.asList("Líquido para oídos", "Paracetamol 1g"));
        // AQUÍ ASIGNO RECETA
        testPaciente1.getHistorial().agregarEntrada(testReceta1);

        // Admin asigna pruebas médicas
        // AQUÍ ASIGNO PRUEBA MÉDICA
        testAdmin1.asignarPrueba(testPaciente1,testPruebaMedica1);
        miVista.imprimir("\nAdministrativo ha asignado prueba médica...");
        // Imprimo historial de Paciente
        miVista.imprimir("\nMédico realiza pruebas...");
        miVista.imprimir(testPruebaMedica1.toString());
        miVista.imprimir("\nMédico receta en base al resultado de las pruebas...");
        miVista.imprimir(testReceta1.toString());

        miVista.imprimir("");
        miVista.imprimir("");
        miVista.imprimir("");

        miVista.imprimir("=== EJERCICIO 1 ===");
        // Ejercicio 1: Recetas por idMedico (nCol) prueba: nCol_001
        /*
        Misael ya tiene previamente una prueba médica y una receta en el historial.
         */
        // Creo un segundo médico con otro número de colegiado
        Medico testMedico2 = new Medico("Medico2","999999999M","medico2@gmail.com","medico2_direccion","usermedico2","passmedico2","saltmedico2","nCol_002",Especialidad.CARDIOLOGIA);
        // AÑADO OTRAS PRUEBAS:
        PruebaMedica testPruebaMedica2 = new PruebaMedica(LocalDate.now(),testMedico1.getNumeroColegiado(),"Dolor de tripa.",TipoPrueba.ECOGRAFIA,"Está sano.");
        testPaciente1.getHistorial().agregarEntrada(testPruebaMedica2);
        Receta testReceta2 = new Receta(LocalDate.now(),testMedico2.getNumeroColegiado(),"Ansiedad",Arrays.asList("Calmantes", "Agua"));
        // Imprimir historial de paciente
        miVista.imprimir(testPaciente1.getHistorial().toString());
        // Imprimo historial de paciente por idDeMedico y tipo receta.
        miVista.imprimir("Buscando recetas de " + testMedico1.getNumeroColegiado() + " en paciente " + testPaciente1.getNombre());
        miVista.imprimir("Recetas: " + testPaciente1.getHistorial().obtenerRecetaPorMedico(testPaciente1,testMedico1.getNumeroColegiado()));

        miVista.imprimir("");
        miVista.imprimir("");
        miVista.imprimir("");

        miVista.imprimir("=== EJERCICIO 2 ===");
        // EJERCICIO 2: Creo un Enfermero
        Enfermero pruebaEnfermero = new Enfermero("Juan","123456789E","juan.enfermero@gmail.com","Dirección de enfermero","juan.enfermero","passwordhash","salt","nColE_001",EspecialidadEnfermeria.URGENCIAS);
        miVista.imprimir("Especialidad: " + pruebaEnfermero.getEspecialidadEnfermeria());
        miVista.imprimir("Actualizando especialidad...");
        pruebaEnfermero.setEspecialidadEnfermeria(EspecialidadEnfermeria.PEDIATRICO);
        miVista.imprimir(pruebaEnfermero.toString());

        miVista.imprimir("");
        miVista.imprimir("");
        miVista.imprimir("");

        miVista.imprimir("=== EJERCICIO 3 ===");
        // EJERCICIO 3: Analisis
        Analisis testAnalisis1 = new Analisis(LocalDate.now(),testMedico1.getNumeroColegiado(),"Análisis anual",TipoAnalisis.SANGRE, EstadoAnalisis.COMPLETADO);
        Analisis testAnalisis2 = new Analisis(LocalDate.now(),testMedico2.getNumeroColegiado(),"Malestar al comer mango",TipoAnalisis.ALERGIA, EstadoAnalisis.PENDIENTE);
        testPaciente1.getHistorial().agregarEntrada(testAnalisis1);
        testPaciente1.getHistorial().agregarEntrada(testAnalisis2);
        miVista.imprimir(testPaciente1.getHistorial().toString());

        miVista.imprimir("");
        miVista.imprimir("");
        miVista.imprimir("");

        miVista.imprimir("=== EJERCICIO 4 ===");
        // EJERCICIO 4: Imprimir entradas entradas tipo análisis
        miVista.imprimir("Analisis de Misael: " + testPaciente1.getHistorial().obtenerAnalisisDeHistorial(testPaciente1));
    }
}
