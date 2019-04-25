package utilpack;

public class DecoratorDemo {
	public static void main(String[] args) {
		Food food = new Rice();
		System.out.println(food.cost());
		food = new Rice(food);
		System.out.println("Two Rice .. :" + food.cost());
		food = new Daal(food);
		System.out.println("Two Rice + Daal .. :" + food.cost());
		food = new Chicken(food);
		System.out.println("Two Rice + Daal + Chicken .. :" + food.cost());
	}
}
abstract class Food {
	public abstract int cost();
}
abstract class VegFood extends Food { }
abstract class NonVegFood extends Food { }
class Rice extends VegFood {
	Food food;
	public Rice() {
		
	}
	public Rice(Food food) {
		this.food = food;
	}
	@Override
	public int cost() {
		if(food != null)
			return 10+food.cost();
		else 
			return 10;
	}
}
class Daal extends VegFood {
	Food food;
	public Daal() {
		
	}
	public Daal(Food food) {
		this.food = food;
	}
	@Override
	public int cost() {
		if(food != null)
			return 5+food.cost();
		else 
			return 5;
	}
}
class Chicken extends NonVegFood {
	Food food;
	public Chicken() {
		
	}
	public Chicken(Food food) {
		this.food = food;
	}
	@Override
	public int cost() {
		if(food != null)
			return 30+food.cost();
		else 
			return 30;
	}
}