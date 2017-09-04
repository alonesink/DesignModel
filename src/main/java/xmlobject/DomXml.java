package xmlobject;

/*
*  Created by WangDi on 2017/9/4 0004
*/

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class DomXml implements XmlDoc{


    @Override
    public void parseXml(String filePath) {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

        try {

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(filePath);
            NodeList users = document.getChildNodes();

        } catch (ParserConfigurationException e) {

            e.printStackTrace();
        } catch (SAXException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
