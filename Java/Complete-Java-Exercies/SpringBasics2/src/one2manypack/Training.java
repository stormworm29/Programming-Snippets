package one2manypack;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

@Entity(name="training")
@Table(name="training")
public class Training {
	private static final String name1 = "aaaa";
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public int tid;
	
	@CollectionOfElements
	public Collection<Employee> employees;
	
	@ManyToMany(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	@JoinTable(name="Employee_has_training")
	public Collection<Employee> getEmployees() {
		return employees;
	}
}
