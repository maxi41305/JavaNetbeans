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
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author maxii
 */
public class PlantillaAlquiler {
    String nombre;
    String direccion;
    int precio;
    String rutaImagen;
    String alquiler;
    String telefono;
    int horaa;
    int minuto;
    int segundo;
       // DateFormat jjj = new SimpleDateFormat("hh:mm:ss");
        //Time hora = new Time(horaa,minuto,segundo); 
    String fecha;
        
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public PlantillaAlquiler(String nombre, String direccion,int precio, String rutaImagen, String alquiler,String telefono,int horaa, int minuto, int segundo,String fecha){
        this.nombre = nombre;
        this.direccion = direccion;
        this.precio = precio;
        this.rutaImagen = rutaImagen;
        this.alquiler = alquiler;
        this.telefono = telefono;
        this.horaa = horaa;
        this.minuto = minuto;
        this.segundo = segundo;
        
        this.fecha = fecha;
              
        
        documento = new Document();
        titulo  = new Paragraph("PEDIDO DE ALQUILER");        
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
        DateFormat jjj = new SimpleDateFormat("hh:mm:ss");
        Time hora = new Time(horaa,minuto,segundo);
            
            documento.add(image);//agrega la imagen al documento
            
            documento.add(titulo);
            
            documento.add(new Paragraph("NOMBRE: " + nombre));
            documento.add(new Paragraph("DIRECCION: " + direccion));
            documento.add(new Paragraph("PRECIO: " + precio));
            documento.add(new Paragraph("ALQUILER: " + alquiler));
             documento.add(new Paragraph("TELEFONO: " + telefono));
            documento.add(new Paragraph("HORA: " + hora));
            documento.add(new Paragraph("FECHA: " + fecha));
            
            documento.add(Chunk.NEWLINE);
            
            Paragraph texto = new Paragraph("BIENVENIDO "+nombre+" GRACIAS POR UTILIZAR NUESTROS SERVICIOS");
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
