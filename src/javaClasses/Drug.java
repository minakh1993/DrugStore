package javaClasses;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Drug")
@Access(AccessType.FIELD)
public class Drug implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "code", nullable = false, length = 50)
	private int code;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@OneToMany(mappedBy = "drug")
	private Set<DrugAssurance> Assurances = new HashSet<DrugAssurance>();

	public Drug(int code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Drug() {
		super();
	}

	public Set<DrugAssurance> getAssurances() {
		return Assurances;
	}

	public void setAssurances(Set<DrugAssurance> Assurance) {
		this.Assurances = Assurance;
	}

}
