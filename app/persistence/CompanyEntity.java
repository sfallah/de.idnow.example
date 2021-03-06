package persistence;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="COMPANY")
public class CompanyEntity implements Serializable {

	private static final long serialVersionUID = 4874274128501308L;

	@Id
	@Column(name = "ID")
	Long id;

	@Column(name = "NAME")
	String name;

	@Column(name = "SLA_TIME")
	Integer slaTime;

	@Column(name = "SLA_PERCENTAGE")
	Double slaPercentage;

	@Column(name = "CURRENT_SLA_PERCENTAGE")
	Double currentSlaPercentage;

	public CompanyEntity() {
		super();
	}

	public CompanyEntity(Long id, String name, Integer slaTime, Double slaPercentage,
			Double currentSlaPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.slaTime = slaTime;
		this.slaPercentage = slaPercentage;
		this.currentSlaPercentage = currentSlaPercentage;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSlaTime() {
		return slaTime;
	}

	public void setSlaTime(Integer slaTime) {
		this.slaTime = slaTime;
	}

	public Double getSlaPercentage() {
		return slaPercentage;
	}

	public void setSlaPercentage(Double slaPercentage) {
		this.slaPercentage = slaPercentage;
	}

	public Double getCurrentSlaPercentage() {
		return currentSlaPercentage;
	}

	public void setCurrentSlaPercentage(Double currentSlaPercentage) {
		this.currentSlaPercentage = currentSlaPercentage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((currentSlaPercentage == null) ? 0 : currentSlaPercentage
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((slaPercentage == null) ? 0 : slaPercentage.hashCode());
		result = prime * result + ((slaTime == null) ? 0 : slaTime.hashCode());
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
		CompanyEntity other = (CompanyEntity) obj;
		if (currentSlaPercentage == null) {
			if (other.currentSlaPercentage != null)
				return false;
		} else if (!currentSlaPercentage.equals(other.currentSlaPercentage))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (slaPercentage == null) {
			if (other.slaPercentage != null)
				return false;
		} else if (!slaPercentage.equals(other.slaPercentage))
			return false;
		if (slaTime == null) {
			if (other.slaTime != null)
				return false;
		} else if (!slaTime.equals(other.slaTime))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", slaTime=" + slaTime
				+ ", slaPercentage=" + slaPercentage
				+ ", currentSlaPercentage=" + currentSlaPercentage + "]";
	}
}
