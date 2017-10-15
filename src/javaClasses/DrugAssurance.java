package javaClasses;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="DrugAssurance")
public class DrugAssurance {

	@EmbeddedId
	private DrugAssuranceId Id;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_Drug", insertable = false, updatable = false)
	private Drug drug;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_Assurance", insertable = false, updatable = false)
	private Assurance assurance;

	@Column(name = "assurancePercentage", nullable = false, length = 50)
	private double assurancePercentage;

	public DrugAssurance() {
		super();
	}

	public DrugAssurance( Drug drug, Assurance assurance, double assurancePercentage) {
		super();
		this.Id = new DrugAssuranceId(drug.getCode(), assurance.getCode());
		this.drug = drug;
		this.assurance = assurance;
		this.assurancePercentage = assurancePercentage;
		
		drug.getAssurances().add(this);
		assurance.getDrugs().add(this);
	}

	public DrugAssuranceId getId() {
		return Id;
	}

	public void setId(DrugAssuranceId id) {
		Id = id;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Assurance getAssurance() {
		return assurance;
	}

	public void setAssurance(Assurance assurance) {
		this.assurance = assurance;
	}

	public double getAssurancePercentage() {
		return assurancePercentage;
	}

	public void setAssurancePercentage(double assurancePercentage) {
		this.assurancePercentage = assurancePercentage;
	}

	@Embeddable
	public static class DrugAssuranceId implements Serializable {

		@Column(name = "fk_Drug")
		protected int DrugId;

		@Column(name = "fk_Assurance")
		protected int AssuranceId;

		public DrugAssuranceId() {

		}

		public DrugAssuranceId(int DrugId, int AssuranceId) {
			this.DrugId = DrugId;
			this.AssuranceId = AssuranceId;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + AssuranceId;
			result = prime * result + DrugId;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;

			DrugAssuranceId other = (DrugAssuranceId) obj;

			if (DrugId == 0) {
				if (other.DrugId != 0)
					return false;
			} else if (DrugId != other.DrugId)
				return false;

			if (AssuranceId == 0) {
				if (other.AssuranceId != 0)
					return false;
			} else if (AssuranceId != other.AssuranceId)
				return false;

			return true;
		}

	}

}
