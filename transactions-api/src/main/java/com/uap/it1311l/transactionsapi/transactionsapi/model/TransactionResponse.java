package com.uap.it1311l.transactionsapi.transactionsapi.model;

public class TransactionResponse {
	
	int transactionId;
	int totalPrice;
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
		
}
