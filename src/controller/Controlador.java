package controller;

import model.entities.Administrativo;
import model.entities.Medico;
import model.enums.Especialidad;
import view.Vista;

public class Controlador {
    public void iniciar() {
        Vista miVista = new Vista();


        Administrativo testAdmin1 = new Administrativo("myAdmin","123456789A","myadmin.@hospital.com","c/Almibar 12", "user.myAdmin","passadmin","sal","idAdmin_001");
        Medico testMedico1 = new Medico("Doctor Carrero","123456789B","doctores.carrero@hospital.com","c/Almibar 13", "user.docCarre","passdoc","sal","nCol_001", Especialidad.OTORRINOLARINGOLOGIA);

        miVista.imprimir("--- Usuarios creados ---\n");
        miVista.imprimir(testAdmin1.toString());
        miVista.imprimir(testMedico1.toString());
    }
}
