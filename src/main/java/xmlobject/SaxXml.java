package xmlobject;

/*
*  Created by WangDi on 2017/9/4 0004
*/

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SaxXml implements XmlDoc{


    @Override
    public void parseXml(String filePath) {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {

            SAXParser saxParser = saxParserFactory.newSAXParser();
            InputStream inputStream = new FileInputStream(filePath);
            saxParser.parse(inputStream,new SaxHandler());

        } catch (ParserConfigurationException e) {

            e.printStackTrace();
        } catch (SAXException e) {

            e.printStackTrace();
        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}

class SaxHandler extends DefaultHandler{

    boolean hasAttribute = false;
    Attributes attributes = null;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("users")) {
            return;
        }
        if (qName.equals("user")) {
            return;
        }
        if (attributes.getLength() > 0) {

            this.attributes = attributes;
            this.hasAttribute = true;
        }
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (hasAttribute && (attributes != null)) {

            for (int i = 0; i < attributes.getLength(); i++) {

                System.out.print(attributes.getQName(0) + ":" + attributes.getValue(0));
            }
        }
    }

    public void characters(char[] ch, int start, int length) throws SAXException {

        System.out.print(new String(ch, start, length));
    }
}