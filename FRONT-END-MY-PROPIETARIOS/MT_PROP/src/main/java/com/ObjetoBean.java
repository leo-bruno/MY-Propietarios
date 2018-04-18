package com;

import java.io.InputStream;
import java.io.Serializable;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

@ManagedBean(name="ObjetoBean")
@SessionScoped

public class ObjetoBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String objectno;
	String name;
	
	public String infoEntrante;
	
	List<Objeto> objetos;
	List<String> objetosLista;
	String[] objetosSeleccionados;
	Objeto objeto, objetosSeleccionado;
	
	public ObjetoBean() {
		
	}
	public void listaObjetos()throws Exception{
		URL url = new URL("http://130.193.15.22:8080/Propietarios_MY/webresources/com.Operaciones/metodo3/"+infoEntrante);
        URLConnection connection = url.openConnection();
        Document doc = parseXML(connection.getInputStream());
        
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("objects");
        for(int i=0; i<nList.getLength();i++)
        {
        	Node nNode=nList.item(i);
        	if(nNode.getNodeType() == Node.ELEMENT_NODE) {
        		Element eElement = (Element) nNode;
        		objectno=eElement.getElementsByTagName("objecto").item(0).getTextContent();
        		objetosLista.add(objectno);
        	}
        	
	    }
		
	}
	
	public List<Objeto> getLista()throws Exception{
		URL url = new URL("http://130.193.15.22:8080/Propietarios_MY/webresources/com.Operaciones/metodo3/"+infoEntrante);
        URLConnection connection = url.openConnection();
        objetos=new ArrayList<Objeto>();
        Document doc = parseXML(connection.getInputStream());
        
        doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("objects");
        for(int i=0; i<nList.getLength();i++)
        {
        	Node nNode=nList.item(i);
        	if(nNode.getNodeType() == Node.ELEMENT_NODE) {
        		Element eElement = (Element) nNode;
        		objectno=eElement.getElementsByTagName("objecto").item(0).getTextContent();
        		if(eElement.getElementsByTagName("name").getLength()==0) {name="";}
        		else name=eElement.getElementsByTagName("name").item(0).getTextContent();
        		
        		objeto=new Objeto(objectno,name);
      	        objetos.add(objeto);
        	}
        	
	    }
		return objetos;
		
	}
	
	private Document parseXML(InputStream stream) throws Exception{
        DocumentBuilderFactory objDocumentBuilderFactory = null;
        DocumentBuilder objDocumentBuilder = null;
        Document doc = null;
        try
        {
            objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
            objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();

            doc = objDocumentBuilder.parse(stream);
        }
        catch(Exception ex)
        {
            throw ex;
        }       

        return doc;
    }

	public String getObjectno() {
		return objectno;
	}

	public void setObjectno(String objectno) {
		this.objectno = objectno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfoEntrante() {
		return infoEntrante;
	}

	public void setInfoEntrante(String infoEntrante) {
		this.infoEntrante = infoEntrante;
	}

	public List<Objeto> getObjetos() {
		return objetos;
	}

	public void setObjetos(List<Objeto> objetos) {
		this.objetos = objetos;
	}

	public Objeto getObjeto() {
		return objeto;
	}

	public void setObjeto(Objeto objeto) {
		this.objeto = objeto;
	}

	public String[] getObjetosSeleccionados() {
		return objetosSeleccionados;
	}

	public void setObjetosSeleccionados(String[] objetosSeleccionados) {
		this.objetosSeleccionados = objetosSeleccionados;
	}

	public Objeto getObjetosSeleccionado() {
		return objetosSeleccionado;
	}

	public void setObjetosSeleccionado(Objeto objetosSeleccionado) {
		this.objetosSeleccionado = objetosSeleccionado;
	}
	

}
