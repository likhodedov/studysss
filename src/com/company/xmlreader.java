package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.swing.plaf.nimbus.State;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.Response;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by d.lihodedov on 17.10.2016.
 */
public class xmlreader {

        public static void main(String[] args)
    {
        try
        {
            double rub=1.00;
            double usd=1.00;
            String usdstring= new String();
            URL url = new URL("http://www.ecb.europa.eu/stats/eurofxref/eurofxref-daily.xml");
            URLConnection conn = url.openConnection();

            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(conn.getInputStream());
            document.getDocumentElement().normalize();

            System.out.println("Корневой элемент: " + document.getDocumentElement().getNodeName());
            NodeList nodesList = document.getElementsByTagName(document.getDocumentElement().getChildNodes().item(1).getNodeName());
            System.out.println("--------------------");

            NodeList nodeList = document.getElementsByTagName("Cube");
            for (int i = 0; i < nodeList.getLength(); i++) {
                // Выводим информацию по каждому из найденных элементов
                Node node = nodeList.item(i);
                // System.out.println();
                //System.out.println("Текущий элемент: " + node.getNodeName());
                if (Node.ELEMENT_NODE == node.getNodeType()) {
                    Element element = (Element) node;
                    if (element.getAttribute("currency").equals("USD")){
                        usd=Double.parseDouble(element.getAttribute("rate"));
                        System.out.println(" валюта "
                                + element.getAttribute("currency")+" = " +element.getAttribute("rate"));}

                    if (element.getAttribute("currency").equals("RUB")){
                       rub=Double.parseDouble(element.getAttribute("rate"));
                        usdstring=element.getAttribute("rate");
                        System.out.println(" валюта "
                                + element.getAttribute("currency")+" = " +element.getAttribute("rate"));}}}
           rub=rub/usd;
           // System.out.printf("1$=");
            System.out.printf("1$= %8.4f", rub);
           //System.out.println("1$="+rub+" rubles");

        }
        catch (Exception e)
        {
            System.out.println(e.getLocalizedMessage());
            e.printStackTrace();
        }


    }

public void getcurrency() {

}
}