package manish;

import java.io.FileInputStream;
import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;

public class pdfread {

	public static void main(String[] args) {
		try{
			PdfReader r= new PdfReader(new FileInputStream("manish.pdf"));
			System.out.println("no.of pages: "+r.getNumberOfPages());
			System.out.println("File length: "+r.getFileLength());
		}
		catch(IOException e){
			e.printStackTrace();
		}

	}

}
