package controller;

import model.entities.*;
import model.enums.Especialidad;
import model.enums.TipoPrueba;
import view.Vista;

import java.time.LocalDate;
import java.util.Arrays;

public class Controlador {
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

        // Admin asigna pruebas médicas
        testAdmin1.asignarPrueba(testPaciente1,testPruebaMedica1);
        miVista.imprimir("\nAdministrativo a asignado prueba médica...");
        // Imprimo historial de Paciente
        miVista.imprimir("\nMédico realiza pruebas...");
        miVista.imprimir(testPruebaMedica1.toString());
        miVista.imprimir("\nMédico receta en base al resultado de las pruebas...");
        miVista.imprimir(testReceta1.toString());

        // Imprimir historial de paciente
        miVista.imprimir(testPaciente1.getHistorial().toString());
    }
}
