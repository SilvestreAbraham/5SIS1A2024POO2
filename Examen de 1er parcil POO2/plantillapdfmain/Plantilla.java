
package plantillapdfmain;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Position;
import javax.swing.text.Segment;

/**
 *
 * @author Navi
 */
public class Plantilla {
    
    String nombreDirector;
    String fecha;
    String rutaImagen;
    List<Persona> personas;
    
    Document documento;
    FileOutputStream archivo;
    Paragraph titulo;
    
    public Plantilla(String nombreDirector,
            String fecha,
            String rutaImagen,
            List<Persona> personas)
    {
        this.nombreDirector = nombreDirector;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
        this.personas = personas;
        
        documento = new Document() {
            @Override
            public int getLength() {
                return 0;
            }

            @Override
            public void addDocumentListener(DocumentListener listener) {
            }

            @Override
            public void removeDocumentListener(DocumentListener listener) {
            }

            @Override
            public void addUndoableEditListener(UndoableEditListener listener) {
            }

            @Override
            public void removeUndoableEditListener(UndoableEditListener listener) {
            }

            @Override
            public Object getProperty(Object key) {
            }

            @Override
            public void putProperty(Object key, Object value) {
            }

            @Override
            public void remove(int offs, int len) throws BadLocationException {
            }

            @Override
            public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
            }

            @Override
            public String getText(int offset, int length) throws BadLocationException {
            }

            @Override
            public void getText(int offset, int length, Segment txt) throws BadLocationException {
            }

            @Override
            public Position getStartPosition() {
            }

            @Override
            public Position getEndPosition() {
            }

            @Override
            public Position createPosition(int offs) throws BadLocationException {
            }

            @Override
            public Element[] getRootElements() {
            }

            @Override
            public Element getDefaultRootElement() {
            }

            @Override
            public void render(Runnable r) {
            }
        };
        titulo  = new Paragraph("Plantilla Personalizada");        
    }
    
    public void crearPlantilla(){
        try {
            archivo = new FileOutputStream(nombreDirector + ".pdf");
            PdfWriter.getInstance(documento, archivo);
            documento.open();
            titulo.setAlignment(1);

            Image image = null;
            try {
                image =  Image.getInstance(rutaImagen);
                image.scaleAbsolute(150, 100);
                image.setAbsolutePosition(415, 750);
                
            } catch (Exception e) {
            }
            
            documento.add(image);
            
            documento.add(titulo);
            
            documento.add(new Paragraph("Director: " + nombreDirector));
            
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
            
            PdfPTable tabla = new PdfPTable(4);
            tabla.setWidthPercentage(100);
            PdfPCell name = new PdfPCell(new Phrase("Nombre"));
            name.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell age = new PdfPCell(new Phrase("Edad"));
            age.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell tel = new PdfPCell(new Phrase("Telefono"));
            tel.setBackgroundColor(BaseColor.ORANGE);
            PdfPCell address = new PdfPCell(new Phrase("Dirección"));
            address.setBackgroundColor(BaseColor.ORANGE);
            
            tabla.addCell(name);
            tabla.addCell(age);
            tabla.addCell(tel);
            tabla.addCell(address);            
            
            for(Persona persona: this.personas){
                tabla.addCell(persona.getNombre());                
                tabla.addCell(persona.getEdad()+"");
                tabla.addCell(persona.getTelefono());
                tabla.addCell(persona.getDireccion());                
            }
            documento.add(tabla);          
            documento.add(Chunk.NEWLINE);
            documento.add(new Paragraph("Fecha: " + fecha));
            
            documento.close();
            JOptionPane.showMessageDialog(null, "El archivo PDF se a creado correctamente!");
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch(DocumentException e){
            System.err.println(e.getMessage());
        }
        
    }

    private static class Paragraph {

        public Paragraph() {
        }
    }
    
    
    
    
}
