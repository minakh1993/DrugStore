package javaClasses;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="drugwarehouse")
@Access(AccessType.FIELD)
public class DrugWarehouse implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="code" , nullable = false, length = 50)
	private int code;
	
	@Column(name="drugCode" , nullable = false, length = 50)
	private Drug drug;
	
	
	@Column(name="expireDate" , nullable = false, length = 50)
	private String expireDate;
	
	@Column(name="drugCount" , nullable = false, length = 50)
	private int drugCount;
	
	@Column(name="price" , nullable = false, length = 50)
	private double price;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	@ManyToOne( targetEntity=Drug.class, fetch = FetchType.EAGER)
	@JoinColumn( name="code",insertable=false, updatable=false, nullable = false)
	public Drug getDrugCode() {
		return drug;
	}

	public void setDrugCode(Drug drug) {
		this.drug = drug;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public int getDrugCount() {
		return drugCount;
	}

	public void setDrugCount(int drugCount) {
		this.drugCount = drugCount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	

	public DrugWarehouse(int code, Drug drug, String expireDate, int drugCount, double price) {
		super();
		this.code = code;
		this.drug = drug;
		this.expireDate = expireDate;
		this.drugCount = drugCount;
		this.price = price;
	}

	public DrugWarehouse() {
		super();
	}
	
	
	
	
	
	

}
