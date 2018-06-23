  package data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import business.God;
import business.Manage;

import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ReadGodData {
	
	String gage;
	String gera;
	String gcolors;
	String gascension;
	String ggender;
	String gbirthRace;
	String gname;
	String gdescription;
	String gimage;
	int ggodID;
	int	gtierID;

	//Read GodData.xml File and add to ArrayList in Manager
	public void getGod() {
		try {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc =builder.parse("GodData.xml");
		NodeList godsList = doc.getElementsByTagName("God");
		for(int i=0;i<godsList.getLength();i++) {
			Node p = godsList.item(i);
			if(p.getNodeType()==Node.ELEMENT_NODE) {
				Element god = (Element) p;
				String id = god.getAttribute("id");
				NodeList namelist = god.getChildNodes();
				for(int j=0;j<namelist.getLength();j++) {
					Node n = namelist.item(j);
					if(n.getNodeType()==Node.ELEMENT_NODE) {
						Element name = (Element) n;
						
						ggodID=Integer.parseInt(id);
						switch(name.getTagName()) {
						case "name":
							gname = name.getTextContent();
							break;
						case "age":
							gage=name.getTextContent();
							break;
						case "colors":
							gcolors=name.getTextContent();
							break;
						case"ascension":
							gascension=name.getTextContent();
							break;
						case"gender":
							ggender=name.getTextContent();
							break;
						case"birthRace":
							gbirthRace=name.getTextContent();
							break;
						case"description":
							gdescription=name.getTextContent();
							break;
						case"image":
							gimage=name.getTextContent();
							break;
						case"tierID":
							gtierID=Integer.parseInt(name.getTextContent());
							break;
							default:
								break;
						}
					}
				}
			}
			Manage manage = new Manage();
			 God ggod = new God(gage,gera,gcolors,gascension,ggender,gbirthRace,gname,gdescription,gimage,gtierID,ggodID);
			 manage.addGod(ggod);
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
