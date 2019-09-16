package iii;

        import  javax.xml.parsers.*;
        import  javax.xml.transform.*;
        import  javax.xml.transform.stream.*;
        import  javax.xml.transform.dom.*;
        import org.w3c.dom.*;

public class MakeXML {
    public static void main(String args[]){
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder      docBuilder   = docFactory.newDocumentBuilder();
//root
            Document doc = docBuilder.newDocument();
            Element rootElement =doc.createElement("company");
            doc.appendChild(rootElement);

//staff
            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);

//set
            Attr attr = doc.createAttribute("id");
            attr.setValue("1");
            staff.setAttributeNode(attr);

//short
//staff.setAttribute("id","1"")

//firstname
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("yong"));
            staff.appendChild(firstname);

//lastname
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("mook kim"));
            staff.appendChild(lastname);

//nickname
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("mkyong"));
            staff.appendChild(nickname);

//salary
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("10000"));
            staff.appendChild(salary);

//write
            TransformerFactory transformerFactory  = TransformerFactory.newInstance();
            Transformer   transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);

//output
            StreamResult  result = new StreamResult(System.out);
            transformer.transform(source,result);
        } catch (ParserConfigurationException pce){
            pce.printStackTrace();
        } catch (TransformerException tfe){
            tfe.printStackTrace();
        }

    }
}





