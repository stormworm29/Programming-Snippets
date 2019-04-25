package minherpack;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="maruti")
@DiscriminatorValue(value="maruti")
public class Maruti extends Car implements Serializable{
	
	public String marutifeatures;
	public void handle() {
		new MyHandler().handle(this);
	}
	public String getMarutifeatures() {
		return marutifeatures;
	}
	public void setMarutifeatures(String marutifeatures) {
		this.marutifeatures = marutifeatures;
	}
	public String toString() {
		return "maruti:"+marutifeatures+".."+super.toString();
	}
	
}
