package com.java.assessment.api.Dto;

import java.math.BigInteger;

public class TransactionBalanceDto {

	private BigInteger transactionId;
	private String transactionType;
	private double amount;
	private PlayerBalanceDto player;

	public BigInteger getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(BigInteger transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public PlayerBalanceDto getPlayer() {
		return player;
	}

	public void setPlayer(PlayerBalanceDto player) {
		this.player = player;
	}

}
