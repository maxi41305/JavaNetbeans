
package plantillapdfmain;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author Navi
 */
public class Plantilla {
    
    String nombre;
    String apellido;
    String fecha;
    String rutaImagen;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public Plantilla(String nombre, String apellido, String fecha, String rutaImagen){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        
        documento = new Document();
        titulo  = new Paragraph("Plantilla Personalizada");        
    }
    
    public void crearPlantilla(){
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
            
            documento.add(new Paragraph("Nombre: " + nombre));
            documento.add(new Paragraph("Apellidos: " + apellido));
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("It is a long established fact that a reader will be distracted by the readable content of "
                    + "a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution"
                    + " of letters, as opposed to using 'Content here, content here', making it look like readable English. "
                    + "Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for "
                    + "'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, "
                    + "sometimes on purpose (injected humour and the like).");
            texto.setAlignment(Element.ALIGN_JUSTIFIED);
            documento.add(texto);
            
            documento.add(Chunk.NEWLINE);
            
            documento.add(new Paragraph("Fecha: " + fecha));
            
            documento.close();
            System.out.println("Archivo creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }
    
    
    
    
}
