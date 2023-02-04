/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelos.Departamento;
import modelos.Departamentos;
import modelos.Empleado;
import modelos.Empleados;
import modelos.Entrada;

/**
 *
 * @author damm
 */
public class GestionBD {

    // Host
    private final String HOST;

    // Usuario
    private final String USUARIO;

    // Contraseña
    private final String PASSWORD;

    // Nombre de la BD
    private final String BD;

    //Puerto
    private final int PUERTO;

    //Conexion
    private Connection conexion;

    public GestionBD(String HOST, String USUARIO, String PASSWORD, String BD, int PUERTO) {
        this.HOST = HOST;
        this.USUARIO = USUARIO;
        this.PASSWORD = PASSWORD;
        this.BD = BD;
        this.PUERTO = PUERTO;
    }

    private void conectar() {
        try {

            //Indicamos que driver vamos a usar
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Inicializamos la cadena de conexion
            conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?serverTimezone=UTC", USUARIO, PASSWORD);

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            System.err.println(ex.getSQLState());
        }
    }

    private boolean desconectar() {

        boolean resultado = true;
        try {
            conexion.close();
        } catch (SQLException ex) {
            System.err.println("Error al desconectar.");
            resultado = false;
        }
        return resultado;
    }

    /**
     *
     * @param ent etrada
     * @return boolean si se inserta
     */
    public boolean insertarFichajeEntrada(Entrada ent) {
        boolean resultadoInsertar = true;
        try {
            conectar();
            Statement sentencia = conexion.createStatement();

            //Preparamos las sencias SQL
            String sql = String.format("INSERT INTO fichajes (codigo,fecha_entrada)"
                    + " VALUES ('%s', NOW())",
                    ent.getCodigo());
            System.out.println("Consulta SQL " + sql);

            resultadoInsertar = !sentencia.execute(sql);
            

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un fichaje de enetrada");
            resultadoInsertar = false;
        }

        return resultadoInsertar;
    }

    /**
     *
     * @param ent
     * @return boolean si se ha insertado una salida
     */
    public boolean insertarFichajeSalida(Entrada ent) {
        boolean resultadoInsertar = true;
        try {
            conectar();
            Statement sentencia = conexion.createStatement();

            //Preparamos las sencias SQL
            //Se esta sentencia actualiza la ultima fecha de salida si es nula dependiendo del codigo
            //En la subconsulta se mete un select dentro de un form porque simula que se crea una tabla temporal
            String sql = String.format(
                    "update fichajes \n"
                    + "set fecha_salida =now() \n"
                    + "WHERE codigo = '%s' and fecha_salida is null and fecha_entrada = (select *\n"
                    + "                                                                  from (select f.fecha_entrada \n"
                    + "                                                                        from fichajes  f\n"
                    + "                                                                        where f.codigo = '%s' \n"
                    + "                                                                        ORDER BY f.fecha_entrada DESC \n"
                    + "                                                                        LIMIT 1) AS f );",
                     ent.getCodigo(),
                     ent.getCodigo());
            System.out.println("Consulta SQL " + sql);

            resultadoInsertar = sentencia.execute(sql);

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar un fichaje de Salida");
            resultadoInsertar = false;
        }

        return resultadoInsertar;
    }

    public boolean insertarDepartamento(Departamento dpto) {
        boolean resultadoInsertar = true;

        try {
            // Conectamos a la BD
            conectar();

            //Creamos la sentencia
            Statement sentencia = conexion.createStatement();

            //Preparamos las sencias SQL
            String sql = String.format("INSERT INTO departamentos (nombre)"
                    + " VALUES ('%s')",
                    dpto.getNombre());

            System.out.println("Consulta SQL " + sql);

            resultadoInsertar = sentencia.execute(sql);

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar el departamento");
            resultadoInsertar = false;
        }

        return resultadoInsertar;
    }

    public boolean insertarEmpleado(Empleado emp) {
        boolean resultadoInsertar = true;

        try {
            // Conectamos a la BD
            conectar();

            //Creamos la sentencia
            Statement sentencia = conexion.createStatement();

            //Preparamos las sencias SQL
            String sql = String.format("INSERT INTO empleados (nombre ,apellidos, departamento, salario, email)"
                    + " VALUES ('%s', '%s', '%s', '%s', '%s')",
                    emp.getNombre(),
                    emp.getApellidos(),
                    emp.getDpto().getIdDepartamento(),
                    emp.getSalario(),
                    emp.getEmail());

            System.out.println("Consulta SQL " + sql);

            resultadoInsertar = sentencia.execute(sql);

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al insertar el empleado");
            resultadoInsertar = false;
        }

        return resultadoInsertar;
    }

    public boolean borrarEmpleado(Empleado emp) {

        boolean resultadoBorrar = true;

        try {
            // Conectamos a la BD
            conectar();

            //Creamos la sentencia
            Statement sentencia = conexion.createStatement();

            //Preparamos las sencias SQL
            String sql = String.format("DELETE FROM empleados where idEmpleado = '%s'",
                    emp.getIdEmpleado());

            System.out.println("Consulta SQL " + sql);

            resultadoBorrar = sentencia.execute(sql);

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al borrar el empleado");
            resultadoBorrar = false;
        }

        return resultadoBorrar;
    }

    public boolean modificarEmpleado(Empleado emp, Empleado emp_new) {
        boolean resultadoModificar = true;
        // Conectamos a la BD
        conectar();
        try ( //Creamos la sentencia
                 Statement sentencia = conexion.createStatement()) {

            //Preparamos las sencias SQL
            String sql = String.format("UPDATE empleados  SET nombre = '%s', apellidos = '%s', departamento = '%s', salario = '%s', email = '%s' WHERE idEmpleado = '%s'",
                    emp_new.getNombre(),
                    emp_new.getApellidos(),
                    emp_new.getDpto().getIdDepartamento(),
                    emp_new.getSalario(),
                    emp_new.getEmail(),
                    emp.getIdEmpleado());

            System.out.println("Consulta SQL " + sql);

            resultadoModificar = sentencia.execute(sql);

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al modificar el empleado");
            resultadoModificar = false;
        }

        return resultadoModificar;

    }

    public Empleados listaEmpleados() {

        Empleados listado = new Empleados();
        ResultSet rs;

        try {
            conectar();
            Statement sentencia = conexion.createStatement();
            //preparamos la sentencia SQL
            String sql = String.format("SELECT * FROM empleados INNER JOIN departamentos ON departamentos.idDepartamento = empleados.departamento");
            //Ejecutamos la consulta
            sentencia.execute(sql);
            //Asignar el resultset de la consulta
            rs = sentencia.getResultSet();
            //Recorremos los datos del Resultset
            while (rs.next()) {
                listado.addEmpleado(new Empleado(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(6),
                        new Departamento(rs.getInt(4), rs.getString(8)),
                        rs.getFloat(5)));
            }
            rs.close();
            sentencia.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listado;

    }

    public Empleado obtenerEmpleado(Entrada entrada) {

        Empleado listado = new Empleado();
        ResultSet rs;

        try {
            conectar();
            Statement sentencia = conexion.createStatement();
            //preparamos la sentencia SQL
            String sql = String.format("SELECT e.* FROM empleados e "
                    + "                           inner join fichajes ON fichajes.codigo = e.codigo"
                    + "                                                 WHERE e.codigo = '%s'",
                    entrada.getCodigo());
            //Ejecutamos la consulta
            sentencia.execute(sql);
            //Asignar el resultset de la consulta
            rs = sentencia.getResultSet();
            //Recorremos los datos del Resultset
            listado = new Empleado(
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(6),
                    new Departamento(rs.getInt(4), rs.getString(8)),
                    rs.getFloat(5));

            rs.close();
            sentencia.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listado;

    }

    public boolean borrarDepartamento(Departamento dpto) {

        boolean resultadoBorrar = true;
        // Conectamos a la BD
        conectar();
        try ( //Creamos la sentencia
                 Statement sentencia = conexion.createStatement();) {

            //Preparamos las sencias SQL
            String sql = String.format("DELETE FROM departamentos where idDepartamento = '%s'",
                    dpto.getIdDepartamento());

            System.out.println("Consulta SQL " + sql);

            resultadoBorrar = sentencia.execute(sql);

            sentencia.close();

            desconectar();

        } catch (SQLException ex) {
            System.out.println("Error al borrar el departamento");
            resultadoBorrar = false;
        }

        return resultadoBorrar;
    }

    public boolean modificarDepartamentos(Departamento dpto, Departamento dpto_new) {
        boolean resultadoModificar = true;
        // Conectamos a la BD
        conectar();
        try ( //Creamos la sentencia
                 Statement sentencia = conexion.createStatement()) {

            //Preparamos las sencias SQL
            String sql = String.format("UPDATE departamentos  SET nombre = '%s' WHERE idDepartamento = '%s'",
                    dpto_new.getNombre(),
                    dpto.getIdDepartamento());

            System.out.println("Consulta SQL " + sql);

            resultadoModificar = sentencia.execute(sql);

            sentencia.close();

            desconectar();
        } catch (SQLException ex) {
            System.out.println("Error al modificar el departamentos");
            resultadoModificar = false;
        }

        return resultadoModificar;

    }

    public Departamentos listaDepartamentos() {

        Departamentos listado = new Departamentos();
        ResultSet rs;
        conectar();
        try ( Statement sentencia = conexion.createStatement()) {
            //preparamos la sentencia SQL
            String sql = String.format("SELECT * FROM departamentos");
            //Ejecutamos la consulta
            sentencia.execute(sql);
            //Asignar el resultset de la consulta
            rs = sentencia.getResultSet();
            //Recorremos los datos del Resultset
            while (rs.next()) {
                listado.addDepartamento(new Departamento(
                        rs.getInt(1),
                        rs.getString(2)));
            }
            rs.close();
            sentencia.close();
            conexion.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return listado;

    }

}
