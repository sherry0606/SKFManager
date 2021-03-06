package com.group12.domain.entity;
// Generated Apr 9, 2017 5:30:06 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Invoice generated by hbm2java
 */
@Entity
@Table(name = "invoice", catalog = "SKF")
public class Invoice implements java.io.Serializable {

	private Integer invNum;
	private boolean invIsMem;
	private boolean invIsPro;
	private boolean invIsRank;

	public Invoice() {
	}

	public Invoice(boolean invIsMem, boolean invIsPro, boolean invIsRank) {
		this.invIsMem = invIsMem;
		this.invIsPro = invIsPro;
		this.invIsRank = invIsRank;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Inv_Num", unique = true, nullable = false)
	public Integer getInvNum() {
		return this.invNum;
	}

	public void setInvNum(Integer invNum) {
		this.invNum = invNum;
	}

	@Column(name = "Inv_Is_Mem", nullable = false)
	public boolean isInvIsMem() {
		return this.invIsMem;
	}

	public void setInvIsMem(boolean invIsMem) {
		this.invIsMem = invIsMem;
	}

	@Column(name = "Inv_Is_Pro", nullable = false)
	public boolean isInvIsPro() {
		return this.invIsPro;
	}

	public void setInvIsPro(boolean invIsPro) {
		this.invIsPro = invIsPro;
	}

	@Column(name = "Inv_Is_Rank", nullable = false)
	public boolean isInvIsRank() {
		return this.invIsRank;
	}

	public void setInvIsRank(boolean invIsRank) {
		this.invIsRank = invIsRank;
	}

}
