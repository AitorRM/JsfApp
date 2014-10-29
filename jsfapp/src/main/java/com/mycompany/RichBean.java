package com.mycompany;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean
public class RichBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    @PostConstruct
    public void postContruct() {
        name = "Aitor";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}