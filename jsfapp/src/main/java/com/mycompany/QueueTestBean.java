package com.mycompany;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean
@RequestScoped
public class QueueTestBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String text1;
	private String text2;

	public Date getNow1() {
		return (new Date());
	}

	public Date getNow2() {
		return (new Date());
	}

	public void action1() {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void action2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	

	public String getText1() {
		return text1;
	}

	public void setText1(String text1) {
		this.text1 = text1;
	}

	public String getText2() {
		return text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public void upperCase1(AjaxBehaviorEvent event) {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setText1(text1.toUpperCase());
	}
	
	public void upperCase2(AjaxBehaviorEvent event) {
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setText2(text2.toUpperCase());
	}
}