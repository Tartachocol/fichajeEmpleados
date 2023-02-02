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
public class Departamentos {

    private ArrayList<Departamento> lista;

    public Departamentos() {
        lista = new ArrayList();
    }

    void addDepartamento(Departamento dpto) {
        lista.add(dpto);
    }

    boolean removeDepartamento(int codDepartamento) {
        boolean encontrado = false;
        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getIdDepartamento() == codDepartamento) {
                lista.remove(i);
                encontrado = true;

            }
        }
        return encontrado;
    }

    // Devuelve el departamento, si noi lo encuentroa devuelve el departamento nulo.
    Departamento getDepartamenrto(int codDepartamento) {
        Departamento dptoEncontrado = null;

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).getIdDepartamento() == codDepartamento) {
                dptoEncontrado = lista.get(i);

            }

        }
        return dptoEncontrado;
    }

}
