/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora1;
import java.awt.Desktop;
import java.io.*;


/**
 *
 * @author braya
 */
public class Archivo {
    public static void escribir(String Narchivo,String contenido){
    File  archivo = new File(Narchivo);
        try {
        try (PrintWriter salida = new PrintWriter(new FileWriter(archivo,true))) {
            salida.println(contenido);
        }
        } catch (FileNotFoundException ex) {
          ex.printStackTrace(System.out);
        } catch (IOException ex) {
           ex.printStackTrace(System.out);
        }
    }
      
      public void abrirarchivo(String archivo){

     try {

            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }

} 
      public void eliminararchivo(String archivo){

          File objetofile = new File (archivo);
          objetofile.delete();

}       
    
}
