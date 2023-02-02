/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author DAMM
 */
public class Empleados {

    private ArrayList<Empleado> lista;

    public Empleados() {
        lista = new ArrayList<>();
    }

    public boolean addEmpleado(Empleado emp) {
        return lista.add(emp);
    }

    public Empleado getEmpleado(int idEmpleado) {
        Empleado encontrado = null;
        for (int i = 0; i < lista.size(); i++) {
            //Comprobamos si el idEmpleado es el que corresponde
            if (idEmpleado == lista.get(i).getIdEmpleado()) {
                encontrado = lista.get(i);

            }
        }
        return encontrado;
    }

    ///Metodo Get
    public boolean removeEmpleado(int idEmpleado) {

        return lista.remove(this.getEmpleado(idEmpleado));

    }

}
