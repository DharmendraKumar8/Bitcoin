/*package com.oodles.domain;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrganizationalWallet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long orgId;

	private String walletUid;
	private Date updateDate;
	private String qrCode;

	public OrganizationalWallet(long orgId, String walletUid, Date updateDate, String qrCode) {
		super();
		this.orgId = orgId;
		this.walletUid = walletUid;
		this.updateDate = updateDate;
		this.qrCode = qrCode;
	}

	public long getOrgId() {
		return orgId;
	}

	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}

	public String getWalletUid() {
		return walletUid;
	}

	public void setWalletUid(String walletUid) {
		this.walletUid = walletUid;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

}
*/