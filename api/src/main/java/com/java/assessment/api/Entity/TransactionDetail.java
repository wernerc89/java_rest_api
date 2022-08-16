package com.java.assessment.api.Entity;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

@Entity
@Component
public class TransactionDetail {
	public TransactionDetail() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger transactionId;

	@ManyToOne
	@JoinColumn(name = "playerId")
	private Player player;
	private String transactionType;
	private LocalDateTime transactionDatetime;
	private double amount;

	public BigInteger getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(BigInteger transactionId) {
		this.transactionId = transactionId;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Player getPlayer() {
		return player;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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

//	

}
