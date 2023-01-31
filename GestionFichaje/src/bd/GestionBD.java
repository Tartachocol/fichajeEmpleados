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
            conexion = DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD, USUARIO, PASSWORD);

        } catch (ClassNotFoundException e) {
        } catch (SQLException ex) {
            Logger.getLogger(GestionBD.class.getName()).log(Level.SEVERE, null, ex);
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
     * @return  boolean si se inserta
     */
    public boolean insertarFichajeEntrada(Entrada ent) {
        boolean resultadoInsertar = true;
        try {
            conectar();
            Statement sentencia = conexion.createStatement();

            //Preparamos las sencias SQL
            String sql = String.format("INSERT INTO fichaje (codigo,fecha_entrada)"
                    + " VALUES ('%s', NOW())",
                    ent.getCodigo());
            System.out.println("Consulta SQL " + sql);

            resultadoInsertar = sentencia.execute(sql);

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
            String sql = String.format("UPDATE fichaje set fechaSalida = '%' WHERE fechaSalida = null, and codigo = '%s'"
                    + ent.getCodigo(),
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

    
//        public Entrada listaEmpleados() {
//
//        Entrada listado = new Entrada();
//        ResultSet rs;
//        conectar();
//        try ( Statement sentencia = conexion.createStatement()) {
//            //preparamos la sentencia SQL
//            String sql = String.format("SELECT * FROM empleados INNER JOIN departamentos ON departamentos.idDepartamento = empleados.departamento");
//            //Ejecutamos la consulta
//            sentencia.execute(sql);
//            //Asignar el resultset de la consulta
//            rs = sentencia.getResultSet();
//            //Recorremos los datos del Resultset
//            while (rs.next()) {
//                listado.addEmpleado(new Entrada(
//                        rs.getInt(1),
//                        rs.getString(2),
//                        rs.getString(3),
//                        rs.getString(6),
//
//                        ,
//                        rs.getFloat(5)));
//            }
//            rs.close();
//            sentencia.close();
//            conexion.close();
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//        return listado;
//
//    }
}