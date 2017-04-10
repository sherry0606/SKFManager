package com.group12.domain.entity;
// Generated Apr 9, 2017 5:30:06 PM by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Payment generated by hbm2java
 */
@Entity
@Table(name = "payment", catalog = "SKF")
public class Payment implements java.io.Serializable {

	private PaymentId id;
	private Date payCreatTime;
	private Date payPayTime;
	private float payPrice;
	private Boolean payFailed;

	public Payment() {
	}

	public Payment(PaymentId id, Date payCreatTime, float payPrice) {
		this.id = id;
		this.payCreatTime = payCreatTime;
		this.payPrice = payPrice;
	}

	public Payment(PaymentId id, Date payCreatTime, Date payPayTime, float payPrice, Boolean payFailed) {
		this.id = id;
		this.payCreatTime = payCreatTime;
		this.payPayTime = payPayTime;
		this.payPrice = payPrice;
		this.payFailed = payFailed;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "stuNum", column = @Column(name = "Stu_Num", nullable = false)),
			@AttributeOverride(name = "invNum", column = @Column(name = "Inv_Num", nullable = false)) })
	public PaymentId getId() {
		return this.id;
	}

	public void setId(PaymentId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Pay_Creat_Time", nullable = false, length = 19)
	public Date getPayCreatTime() {
		return this.payCreatTime;
	}

	public void setPayCreatTime(Date payCreatTime) {
		this.payCreatTime = payCreatTime;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Pay_Pay_Time", length = 19)
	public Date getPayPayTime() {
		return this.payPayTime;
	}

	public void setPayPayTime(Date payPayTime) {
		this.payPayTime = payPayTime;
	}

	@Column(name = "Pay_Price", nullable = false, precision = 12, scale = 0)
	public float getPayPrice() {
		return this.payPrice;
	}

	public void setPayPrice(float payPrice) {
		this.payPrice = payPrice;
	}

	@Column(name = "Pay_Failed")
	public Boolean getPayFailed() {
		return this.payFailed;
	}

	public void setPayFailed(Boolean payFailed) {
		this.payFailed = payFailed;
	}

}
