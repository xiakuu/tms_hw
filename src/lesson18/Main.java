package lesson18;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        String title = "";
        String lastName = "";
        String firstName = "";
        ArrayList<String> text = new ArrayList<>();


        try {
            DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = documentBuilder.parse("src/lesson18/text.xml");
            Node node = document.getDocumentElement();
            NodeList nodeList = node.getChildNodes();


            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node1 = nodeList.item(i);
                if (node1.getNodeType() == 1) {
                    NodeList nodeList1 = node1.getChildNodes();

                    if (node1.getNodeName().equals("title")) {
                        title = node1.getChildNodes().item(0).getTextContent();
                    }

                    if (node1.getNodeName().equals("author")) {

                        for (int i1 = 0; i1 < node1.getChildNodes().getLength(); i1++) {
                            Node node2 = nodeList1.item(i1);

                            if (nodeList1.item(i1).getNodeName().equals("lastName")) {
                                lastName = node2.getChildNodes().item(0).getTextContent();
                            } else if (nodeList1.item(i1).getNodeName().equals("firstName")) {
                                firstName = node2.getChildNodes().item(0).getTextContent();
                            }

                            if (!(lastName.equals("")) && !(firstName.equals(""))) {
                                break;
                            }
                        }
                    }
                    if (node1.getNodeName().equals("lines")) {
                        for (int j = 0; j < node1.getChildNodes().getLength(); j++) {
                            text.add(node1.getChildNodes().item(j).getTextContent());
                        }
                    }
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            System.out.println(e);
        }

        System.out.println(firstName + " " + lastName + " " + title);

        String file = firstName + "_" + lastName + "_" + title + ".txt";

        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < text.size(); i++) {
                fw.write(text.get(i));
                fw.flush();
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    }
