package com.mycompany.datatable;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "sorterColumnsBean")
@ViewScoped
public class SorterColumns implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public static final String UNSORT = "uns";
	public static final String ASCENDING = "asc";
	public static final String DESCENDING = "des";

	private String column1 = UNSORT;
	private String column2 = UNSORT;
	private String column3 = UNSORT;
	private String column4 = UNSORT;
	private String column5 = UNSORT;

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	public String getColumn3() {
		return column3;
	}

	public void setColumn3(String column3) {
		this.column3 = column3;
	}

	public String getColumn4() {
		return column4;
	}

	public void setColumn4(String column4) {
		this.column4 = column4;
	}

	public String getColumn5() {
		return column5;
	}

	public void setColumn5(String column5) {
		this.column5 = column5;
	}
	
	public void switchColumn1() {
		resetOtherColumns(column1);
		column1 = column1.equals(UNSORT)? ASCENDING : (column1.equals(ASCENDING)? DESCENDING : ASCENDING);
	}
	
	public void switchColumn2() {
		resetOtherColumns(column2);
		column2 = column2.equals(UNSORT)? ASCENDING : (column2.equals(ASCENDING)? DESCENDING : ASCENDING);
	}
	
	public void switchColumn3() {
		resetOtherColumns(column3);
		column3 = column3.equals(UNSORT)? ASCENDING : (column3.equals(ASCENDING)? DESCENDING : ASCENDING);
	}
	
	public void switchColumn4() {
		resetOtherColumns(column4);
		column4 = column4.equals(UNSORT)? ASCENDING : (column4.equals(ASCENDING)? DESCENDING : ASCENDING);
	}
	
	public void switchColumn5() {
		resetOtherColumns(column5);
		column5 = column5.equals(UNSORT)? ASCENDING : (column5.equals(ASCENDING)? DESCENDING : ASCENDING);
	}
	
	private void resetOtherColumns(String excludeColumn) {
		column1 = excludeColumn.equals(column1)? column1 : UNSORT;
		column2 = excludeColumn.equals(column2)? column2 : UNSORT;
		column3 = excludeColumn.equals(column3)? column3 : UNSORT;
		column4 = excludeColumn.equals(column4)? column4 : UNSORT;
		column5 = excludeColumn.equals(column5)? column5 : UNSORT;
	}
	
}
