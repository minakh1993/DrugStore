package javaClasses;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Assurance")
@Access(AccessType.FIELD)
public class Assurance implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "code", nullable = false, length = 50)
	private int code;

	@Column(name = "AssuranceName", nullable = false, length = 50)
	private String AssuranceName;

	@OneToMany(mappedBy = "assurance")
	private Set<DrugAssurance> Drugs = new HashSet<DrugAssurance>();

	public Assurance(int code, String assuranceName) {
		super();
		this.code = code;
		AssuranceName = assuranceName;
	}

	
	public Assurance(int code, String AssuranceName, Set<DrugAssurance> Drugs) {
		super();
		this.code = code;
		this.AssuranceName = AssuranceName;
		this.Drugs = Drugs;
	}


	public Assurance() {
		super();
	}


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getAssuranceName() {
		return AssuranceName;
	}

	public void setAssuranceName(String assuranceName) {
		AssuranceName = assuranceName;
	}

	public Set<DrugAssurance> getDrugs() {
		return Drugs;
	}

	public void setDrugs(Set<DrugAssurance> Drugs) {
		this.Drugs = Drugs;
	}

	

}
