package com.fstn;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Invoice implements Serializable{

	private String batchName;
	private Double amount;
	private Date Date;
	
	public Invoice(){
		super();
	}
	
	public Invoice(String batchName, Double amount, java.util.Date date) {
		super();
		this.batchName = batchName;
		this.amount = amount;
		Date = date;
	}
	
	
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}

	@Override
	public String toString() {
		return "Invoice [batchName=" + batchName + ", amount=" + amount + ", Date=" + Date + "]";
	}
	
	
}

