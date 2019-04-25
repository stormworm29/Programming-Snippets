package one2manypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity(name="address")
@Table(name="address")
public class Address {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int aid;
	
	private String city;
	
	@JoinColumn(name="employee_id")
	@Transient
	public Employee employee;
	
	
	@ManyToOne()
	  @JoinColumn( name="employee_eid" )
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


}
