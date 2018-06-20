  package data;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;



import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ReadGodData {
	
	public void selectGod() {
		try {
	         File inputFile = new File("/Runescape/Data/GodData.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("student");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               System.out.println("Student roll no : " 
	                  + eElement.getAttribute("rollno"));
	               System.out.println("First Name : " 
	                  + eElement
	                  .getElementsByTagName("name")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("age" 
	                  + eElement
	                  .getElementsByTagName("age")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("colors" 
	                  + eElement
	                  .getElementsByTagName("colors")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("ascension" 
	                  + eElement
	                  .getElementsByTagName("ascension")
	                  .item(0)
	                  .getTextContent());
	               System.out.println("gender" 
	 	                  + eElement
	 	                  .getElementsByTagName("gender")
	 	                  .item(0)
	 	                  .getTextContent());
	               System.out.println("birthRace" 
		 	                  + eElement
		 	                  .getElementsByTagName("birthRace")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("description" 
		 	                  + eElement
		 	                  .getElementsByTagName("description")
		 	                  .item(0)
		 	                  .getTextContent());
	               System.out.println("description" 
		 	                  + eElement
		 	                  .getElementsByTagName("description")
		 	                  .item(0)
		 	                  .getTextContent());
	            }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	
	
	}
}
