package com.mycompany.datatable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TableTestBean implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private List<User> rowList;

    @PostConstruct
    public void load() {
    	rowList = new ArrayList<User>();
    	
    	rowList.add(new User(1, "usr01", "Aitor", "Rodriguez", "usr01@mycompany.com"));
    	rowList.add(new User(2, "usr02", "Avenger", "Willson", "usr02@mycompany.com"));
    	rowList.add(new User(3, "usr03", "Blaze", "Urban", "usr03@mycompany.com"));
    	rowList.add(new User(4, "usr04", "Captain", "Traylor", "usr04@mycompany.com"));
    	rowList.add(new User(5, "usr05", "Doom", "Ralph", "usr05@mycompany.com"));
    	rowList.add(new User(6, "usr06", "Enigma", "Pool", "usr06@mycompany.com"));
    	rowList.add(new User(7, "usr07", "Fallen", "Osburn", "usr07@mycompany.com"));
    	rowList.add(new User(8, "usr08", "Ghost", "Mcclain", "usr08@mycompany.com"));
    	rowList.add(new User(9, "usr09", "Infinite", "Irwin", "usr09@mycompany.com"));
    	rowList.add(new User(10, "usr10", "Ninja", "Gray", "usr10@mycompany.com"));
    	rowList.add(new User(11, "usr11", "Shadow", "Flagg", "usr11@mycompany.com"));
    	rowList.add(new User(12, "usr12", "Taylor", "Espinosa", "usr12@mycompany.com"));
    	rowList.add(new User(13, "usr13", "Unity", "Daily", "usr13@mycompany.com"));
    	rowList.add(new User(14, "usr14", "Valerie", "Bergeron", "usr14@mycompany.com"));
    	rowList.add(new User(15, "usr15", "Whitnet", "Acosta", "usr15@mycompany.com"));
    	
    }

	public List<User> getRowList() {
		return rowList;
	}
    
    
}
