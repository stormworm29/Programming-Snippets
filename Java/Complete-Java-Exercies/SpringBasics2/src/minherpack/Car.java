package minherpack;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="car")
@DiscriminatorValue(value="car")
public class Car extends Automobile implements Serializable{
	
	public String carfeatures;
	public void handle() {
		new MyHandler().handle(this);
	}
	public String getCarfeatures() {
		return carfeatures;
	}
	public void setCarfeatures(String carfeatures) {
		this.carfeatures = carfeatures;
	}
	public String toString() {
		return "Car:"+super.toString();
	}
	
}