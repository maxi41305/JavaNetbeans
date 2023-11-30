/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CargaDatos;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author maxii
 */
public class plantilla {
    String nombre;
    String apellido;
    int idusuario;
    String rutaImagen;
    String contrasenia;
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public plantilla(String nombre, String apellido, int idusuario, String rutaImagen, String contrasenia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idusuario = idusuario;
        this.rutaImagen = rutaImagen;
        this.contrasenia = contrasenia;
        
        documento = new Document();
        titulo  = new Paragraph("BIENVENIDO");        
    }
    
    public void crearPlantilla() throws DocumentException{
        try {
            archivo = new FileOutputStream(nombre + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            Image image = null;
            try {
                image =  Image.getInstance(rutaImagen);//carga imagen
                image.scaleAbsolute(150, 100);//cambia tamaño
                image.setAbsolutePosition(415, 750);//coloca imagen en la posicion
                
            } catch (Exception e) {
            }
            
            documento.add(image);//agrega la imagen al documento
            
            documento.add(titulo);
            
            documento.add(new Paragraph("NOMBRE: " + nombre));
            documento.add(new Paragraph("APELLIDO: " + apellido));
            documento.add(new Paragraph("USUARIO: " + idusuario));
            documento.add(new Paragraph("CONTRASEÑA: " + contrasenia));
            
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("BIENVENIDO "+nombre+" GRACIAS POR FORMAR PARTE DE NUESTRA SOCIEDAD");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            
            //documento.add(new Paragraph("Fecha: " + fecha));
         
            documento.close();
              JOptionPane.showMessageDialog(null,"PDF CREADOR CORRECTAMENTE");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        }
        
    }
    
    
}
