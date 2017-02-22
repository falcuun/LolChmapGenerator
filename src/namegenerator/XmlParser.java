/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package namegenerator;

import java.io.File;
import javax.swing.JComboBox;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Falcuun
 */
public class XmlParser {

    JComboBox comboBox;
    String champions;
    String prices;

    public void initializeToComboBox() {
        try {
            File inputFile = new File("C:\\Users\\Falcuun\\Desktop\\Champions.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
            NodeList nList = doc.getElementsByTagName("champion");
            System.out.println("----------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    champions = eElement.getElementsByTagName("name").item(0).getTextContent();
                    prices = eElement.getElementsByTagName("price").item(0).getTextContent();
                    comboBox.insertItemAt(champions, temp);
                    System.out.println("\nCurrent Element :" + nNode.getNodeName());
                    System.out.println(champions);
                    System.out.println(prices);

                    // System.out.println("Champion name is : "  + eElement.getElementsByTagName("name").item(0).getTextContent());
                    // System.out.println("Champion price is : " + eElement.getElementsByTagName("price").item(0).getTextContent());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getChampions(){
        return champions;
    }
    public XmlParser(JComboBox cb) {
        this.comboBox = cb;
    }
}
