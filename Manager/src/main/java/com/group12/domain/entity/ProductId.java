package com.group12.domain.entity;
// Generated Apr 2, 2017 1:34:23 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ProductId generated by hbm2java
 */
@Embeddable
public class ProductId implements java.io.Serializable {

	private int invNum;
	private int proCode;

	public ProductId() {
	}

	public ProductId(int invNum, int proCode) {
		this.invNum = invNum;
		this.proCode = proCode;
	}

	@Column(name = "Inv_Num", nullable = false)
	public int getInvNum() {
		return this.invNum;
	}

	public void setInvNum(int invNum) {
		this.invNum = invNum;
	}

	@Column(name = "Pro_Code", nullable = false)
	public int getProCode() {
		return this.proCode;
	}

	public void setProCode(int proCode) {
		this.proCode = proCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProductId))
			return false;
		ProductId castOther = (ProductId) other;

		return (this.getInvNum() == castOther.getInvNum()) && (this.getProCode() == castOther.getProCode());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getInvNum();
		result = 37 * result + this.getProCode();
		return result;
	}

}
