  package data;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ReadGodData {
	
	public void selectGod() {
		try {
		File file = new File("/Runescape/Data/GodData.xml");
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
		        .newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse(file);
		String usr = document.getElementsByTagName("").item(0).getTextContent();
		String pwd = document.getElementsByTagName("").item(0).getTextContent();
		
		System.out.println(usr + pwd);
		}catch(Exception e){
			
		}
	
	
	}
}
