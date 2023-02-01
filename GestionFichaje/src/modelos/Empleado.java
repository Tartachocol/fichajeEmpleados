/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DAMM
 */
public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String email;
    private float salario;
    private int codigo;

    public Empleado() {
        this.idEmpleado = -1;
        this.nombre = null;
        this.apellidos = null;
        this.email = null;
        this.codigo = 0;
        this.salario = 0F;
    }

    public Empleado(int idEmpleado, String nombre, String apellidos, String email, float salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.salario = salario;
    }
    public Empleado(int idEmpleado, String nombre, String apellidos, String email, float salario, int codigo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.salario = salario;
        this.codigo = codigo;
    }
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
