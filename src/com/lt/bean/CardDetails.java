package com.lt.bean;

import java.util.Date;

public class CardDetails {
private int transactid;
private String cardType;
private Date transactDate;
public int getTransactid() {
	return transactid;
}
public void setTransactid(int transactid) {
	this.transactid = transactid;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}
public Date getTransactDate() {
	return transactDate;
}
public void setTransactDate(Date transactDate) {
	this.transactDate = transactDate;
}


}
