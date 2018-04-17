package com;

import java.io.Serializable;

public class Objeto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String objectno;
	String name;
	
	public Objeto(String vObjectno, String vName) {
		objectno=vObjectno;
		name=vName;
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
	
	

}
