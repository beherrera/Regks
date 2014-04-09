/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ADO;
import BL_IngresoEstudiante.Estudiante;
import java.io.File;
import java.io.PrintWriter;
/**
 *
 * @author asis3.desarrollo
 */
public class ManejadorArchivos  {
    public void crearEstudiante(Estudiante est) throws Exception {
        String nombreArchivo;
        nombreArchivo = "D:\\" + est.getCodigo()+".txt";       
        
        // Make sure the user entered a valid file name
        if( !nombreArchivo.equals("")) {
            // Indicate that you are planning to use a file
            File archivoPlano = new File(nombreArchivo);
            try (PrintWriter escribidorArchivo = new PrintWriter(archivoPlano)) 
            {
                escribidorArchivo.println(est.getCodigo());
                escribidorArchivo.println(est.getIdentificación());
                escribidorArchivo.println(est.getNombre());
                escribidorArchivo.println(est.getOtrosNombres());
                escribidorArchivo.println(est.getApellido1());
                escribidorArchivo.println(est.getApellido2());
                escribidorArchivo.println(est.getPrograma());
                escribidorArchivo.close();
            }
            
        }
    }
}
