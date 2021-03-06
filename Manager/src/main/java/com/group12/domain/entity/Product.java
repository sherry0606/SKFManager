package com.group12.domain.entity;
// Generated Apr 9, 2017 5:30:06 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "product", catalog = "SKF")
public class Product implements java.io.Serializable {

	private ProductId id;
	private String proName;
	private String proDescript;
	private float proPrice;
	private int proQoh;

	public Product() {
	}

	public Product(ProductId id, String proName, String proDescript, float proPrice, int proQoh) {
		this.id = id;
		this.proName = proName;
		this.proDescript = proDescript;
		this.proPrice = proPrice;
		this.proQoh = proQoh;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "invNum", column = @Column(name = "Inv_Num", nullable = false)),
			@AttributeOverride(name = "proCode", column = @Column(name = "Pro_Code", nullable = false)) })
	public ProductId getId() {
		return this.id;
	}

	public void setId(ProductId id) {
		this.id = id;
	}

	@Column(name = "Pro_Name", nullable = false, length = 45)
	public String getProName() {
		return this.proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	@Column(name = "Pro_Descript", nullable = false, length = 45)
	public String getProDescript() {
		return this.proDescript;
	}

	public void setProDescript(String proDescript) {
		this.proDescript = proDescript;
	}

	@Column(name = "Pro_Price", nullable = false, precision = 12, scale = 0)
	public float getProPrice() {
		return this.proPrice;
	}

	public void setProPrice(float proPrice) {
		this.proPrice = proPrice;
	}

	@Column(name = "Pro_QOH", nullable = false)
	public int getProQoh() {
		return this.proQoh;
	}

	public void setProQoh(int proQoh) {
		this.proQoh = proQoh;
	}

}
