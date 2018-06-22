package data;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import business.God;

public class ReadTierData {
	
public void getTier(){
	try {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc =builder.parse("TierData.xml");
		NodeList godsList = doc.getElementsByTagName("God");
		for(int i=0;i<godsList.getLength();i++) {
			Node p = godsList.item(i);
			if(p.getNodeType()==Node.ELEMENT_NODE) {
				Element tier = (Element) p;
				String id = tier.getAttribute("id");
				NodeList namelist = tier.getChildNodes();
				for(int j=0;j<namelist.getLength();j++) {
					Node n = namelist.item(j);
					if(n.getNodeType()==Node.ELEMENT_NODE) {
						Element name = (Element) n;
						
						}
					}
				}
			}
		
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

