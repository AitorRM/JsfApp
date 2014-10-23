package com.mycompany;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RegionTestBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
	private String type;
	private String size;
	private String vase;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getVase() {
		return vase;
	}
	public void setVase(String vase) {
		this.vase = vase;
	}
	
}