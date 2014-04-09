/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BL_IngresoEstudiante;

/**
 *
 * @author asis3.desarrollo
 */
public class Estudiante {
    private String codigo;
    private String identificación;
    private String nombre;
    private String otrosNombres;
    private String apellido1;
    private String apellido2;
    private String programa;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the identificación
     */
    public String getIdentificación() {
        return identificación;
    }

    /**
     * @param identificación the identificación to set
     */
    public void setIdentificación(String identificación) {
        this.identificación = identificación;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the otrosNombres
     */
    public String getOtrosNombres() {
        return otrosNombres;
    }

    /**
     * @param otrosNombres the otrosNombres to set
     */
    public void setOtrosNombres(String otrosNombres) {
        this.otrosNombres = otrosNombres;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }

    /**
     * @param programa the programa to set
     */
    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
