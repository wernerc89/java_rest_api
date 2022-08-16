package com.java.assessment.api.Dto;

import java.math.BigInteger;
import java.time.LocalDateTime;

public class TransactionDetailDto {

	private BigInteger transactionId;
	private PlayerDto player;
	private LocalDateTime transactionDatetime;
	private double amount;

	public BigInteger getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(BigInteger transactionId) {
		this.transactionId = transactionId;
	}

	public PlayerDto getPlayer() {
		return player;
	}

	public void setPlayer(PlayerDto player) {
		this.player = player;
	}

	public LocalDateTime getTransactionDatetime() {
		return transactionDatetime;
	}

	public void setTransactionDatetime(LocalDateTime transactionDatetime) {
		this.transactionDatetime = transactionDatetime;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
