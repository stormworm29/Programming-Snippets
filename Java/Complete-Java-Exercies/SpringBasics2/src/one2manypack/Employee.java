package one2manypack;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity(name="employee")
@Table(name="employee")
public class Employee {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int eid;

	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsalary() {
		return esalary;
	}

	public void setEsalary(float esalary) {
		this.esalary = esalary;
	}

	private float esalary;
	
	@CollectionOfElements
	private Collection<Address> addresses;
	//public Collection<Training> trainings;
	
//	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.EAGER)
//	@JoinTable(name="Employee_has_Training")
//	public Collection<Training> getTrainings()
//	{
//		return trainings;
//	}
//	
	@OneToMany(cascade={CascadeType.ALL},
			fetch=FetchType.EAGER,mappedBy = "employee")
	public Collection<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}

	
	
	
}
