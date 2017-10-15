package javaClasses;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "purchasedDrugs")
public class purchasedDrugs {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "purchaseCode")
	private int purchaseCode;

	@ManyToOne(cascade = CascadeType.ALL)
	private Drug DrugCode;

	@Column(name = "cost")
	private double cost;

	@Column(name = "AssuranceShare")
	private double AssuranceShare;

	@Column(name = "AssuranceDebt")
	private double AssuranceDebt;

	public int getPurchaseCode() {
		return purchaseCode;
	}

	public void setPurchaseCode(int purchaseCode) {
		this.purchaseCode = purchaseCode;
	}

	public Drug getDrugCode() {
		return DrugCode;
	}

	public void setDrugCode(Drug drugCode) {
		DrugCode = drugCode;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getAssuranceShare() {
		return AssuranceShare;
	}

	public void setAssuranceShare(double assuranceShare) {
		AssuranceShare = assuranceShare;
	}

	public double getAssuranceDebt() {
		return AssuranceDebt;
	}

	public void setAssuranceDebt(double assuranceDebt) {
		AssuranceDebt = assuranceDebt;
	}

	public purchasedDrugs(int purchaseCode, Drug drugCode, double cost, double assuranceShare, double assuranceDebt) {

		this.purchaseCode = purchaseCode;
		DrugCode = drugCode;
		this.cost = cost;
		AssuranceShare = assuranceShare;
		AssuranceDebt = assuranceDebt;
	}

	public purchasedDrugs() {

	}

}
