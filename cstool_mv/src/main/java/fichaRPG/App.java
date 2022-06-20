package fichaRPG;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Document document = new Document();
        try
        {
           PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("HelloWorld.pdf"));
           document.open();
           document.add(new Paragraph("A Hello World PDF document."));
           document.add(new Paragraph("One of the most significant events in bodybuilding’s history took place in 1975 when two\r\n"
           		+ "relatively unknown filmmakers, George Butler and Jerome Gary, produced the groundbreaking\r\n"
           		+ "documentary Pumping Iron. For nearly a year the two followed the training of the sport’s top\r\n"
           		+ "stars as they prepared for that year’s Mr. Olympia and Mr. Universe contests. Although Arnold\r\n"
           		+ "had decided to retire from the sport, appearing on the big screen was too enticing an\r\n"
           		+ "opportunity to miss and he came back out of retirement. The documentary was based on the\r\n"
           		+ "1974 book of the same name that Butler had written with Charles Gaines. This famous\r\n"
           		+ "documentary helped bring bodybuilding out of school gymnasiums and into large theater and\r\n"
           		+ "concert venues. Besides Arnold, Ed Corney, Robby Robinson, Mike Katz, Franco Columbu,\r\n"
           		+ "Danny Padilla, Serge Nubret, Ken Waller, and Lou Ferrigno all appeared in the film."));
           document.close();
           writer.close();
        } catch (DocumentException e)
        {
           e.printStackTrace();
        } catch (FileNotFoundException e)
        {
           e.printStackTrace();
        }
    }
}
