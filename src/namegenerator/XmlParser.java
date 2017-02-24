package namegenerator;

import java.io.*;
import java.util.LinkedList;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class XmlParser {

    String champions;
    int prices;

    LinkedList<Champion> listOfChampions = new LinkedList<>();

    public void fromXML() {

    }

    public LinkedList parseChampions() {
        try {
            File inputFile = new File("Champions.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("champion");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Champion champion = new Champion();
                    Element eElement = (Element) nNode;
                    champions = eElement.getElementsByTagName("name").item(0).getTextContent();
                    prices = Integer.parseInt(eElement.getElementsByTagName("price").item(0).getTextContent());
                    champion.setName(champions);
                    champion.setPrice(prices);
                    listOfChampions.add(champion);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listOfChampions;
    }
}
