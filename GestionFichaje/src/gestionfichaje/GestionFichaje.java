/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionfichaje;

import bd.GestionBD;
import com.mysql.cj.result.LocalDateTimeValueFactory;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import modelos.Entrada;

/**
 *
 * @author damm
 */
public class GestionFichaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        GestionBD gb = new GestionBD("localhost", "usuario", "usuario", "fichaje", 3306);

        //     Departamento dpto = new Departamento(1, "Geestion Servicios");
        // Empleado emp = new Empleado(3, "Ana", "Sanchez", "ansa@gmail.com", dpto, 999);
//        gb.insertarEmpleado(emp);
        Entrada ent = new Entrada(3);
        gb.insertarFichajeEntrada(ent);

    }

}
