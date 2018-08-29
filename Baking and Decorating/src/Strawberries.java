
public class Strawberries extends ToppingsDecorator{
	Cake cake;
	
	public Strawberries (Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Strawberries";
	}
	
	public double cost() {
		return cake.cost() + 1.99;
	}
}
