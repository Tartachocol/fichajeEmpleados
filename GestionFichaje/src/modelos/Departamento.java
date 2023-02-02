/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DAMM
 */
public class Departamento {

    private int idDepartamento;

    private String nombre;

    public Departamento() {
        idDepartamento = -1;
        nombre = null;
    }

    public Departamento(int idDepartamento, String nombre) {
        this.idDepartamento = idDepartamento;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    @Override
    public String toString() {
        return "Departamento{" + "idDepartamento=" + idDepartamento + ", nombre=" + nombre + '}';
    }

    //Mostramos isNull y nos devolvera si es null
    public boolean isNull() {
        boolean resultado = false;
        if (this.nombre == null && this.idDepartamento == -1) {
            resultado = true;
        }
        return resultado;
    }

}
