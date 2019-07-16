package manish;

import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class pdf{
	public static void main(String args[]){
		
		Document d = new Document();
		Rectangle rect = new Rectangle(432,200);
		d.setPageSize(rect);
		try{
		PdfWriter.getInstance(d, new FileOutputStream("manish.pdf"));
		
		d.open();
		
		Paragraph p = new Paragraph();
		p.add("Hi Manish you have created a paragraph");
		p.setAlignment(Element.ALIGN_CENTER);
		
		d.add(p);
		
		Paragraph p1 = new Paragraph();
		p1.add("This will be the second paragraph");
		
		d.add(p1);
		d.close();
		
		
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	
}
