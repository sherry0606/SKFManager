package com.group12.domain.entity;
// Generated 2017-3-30 17:33:33 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rank generated by hbm2java
 */
@Entity
@Table(name = "rank", catalog = "SKF")
public class Rank implements java.io.Serializable {

	private int rankNum;
	private String rankBelt;

	public Rank() {
	}

	public Rank(int rankNum, String rankBelt) {
		this.rankNum = rankNum;
		this.rankBelt = rankBelt;
	}

	@Id

	@Column(name = "Rank_Num", unique = true, nullable = false)
	public int getRankNum() {
		return this.rankNum;
	}

	public void setRankNum(int rankNum) {
		this.rankNum = rankNum;
	}

	@Column(name = "Rank_Belt", nullable = false, length = 45)
	public String getRankBelt() {
		return this.rankBelt;
	}

	public void setRankBelt(String rankBelt) {
		this.rankBelt = rankBelt;
	}

}