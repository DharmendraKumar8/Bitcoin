/*package com.oodles.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class UserWallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	Date date;
	Long balance;
	@ManyToOne
	@JoinColumn(name = "orgId")
	private OrganizationalWallet organizationalWallet;

	public UserWallet(Long userId, Date date, Long balance, OrganizationalWallet organizationalWallet) {
		super();
		this.userId = userId;
		this.date = date;
		this.balance = balance;
		this.organizationalWallet = organizationalWallet;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public OrganizationalWallet getOrganizationalWallet() {
		return organizationalWallet;
	}

	public void setOrganizationalWallet(OrganizationalWallet organizationalWallet) {
		this.organizationalWallet = organizationalWallet;
	}

}
*/