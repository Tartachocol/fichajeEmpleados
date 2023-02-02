/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author damm
 */
public class Entrada {

    private LocalDateTime fechaEntrada;
    private int codigo;
    private Timestamp fechaSalida;

    public Entrada() {
    }

    public Entrada(int codigo) {
        this.codigo = codigo;
        this.fechaEntrada = fechaEntrada;

    }

    /**
     * @return the fechaEntrada
     */
    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    /**
     * @param fechaEntrada the fechaEntrada to set
     */
    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
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
