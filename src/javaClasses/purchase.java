package javaClasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="purchase")
public class purchase {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name ="purchaseCode")
	private int purchaseCode;
	
	@Column(name = "name")
	private String name;
	
	@Column(name= "family")
	private String family;
	
	@Column(name = "AssuranceCode")
	private int AssuranceCode;
	
	@Column(name = "totalCost")
	private double totalCost;

	public int getPurchaseCode() {
		return purchaseCode;
	}

	public void setPurchaseCode(int purchaseCode) {
		this.purchaseCode = purchaseCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getAssuranceCode() {
		return AssuranceCode;
	}

	public void setAssuranceCode(int assuranceCode) {
		AssuranceCode = assuranceCode;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

	public purchase(int purchaseCode, String name, String family, int assuranceCode, double totalCost) {
		
		this.purchaseCode = purchaseCode;
		this.name = name;
		this.family = family;
		AssuranceCode = assuranceCode;
		this.totalCost = totalCost;
	}

	public purchase() {
		
	}
	
		
	
}
