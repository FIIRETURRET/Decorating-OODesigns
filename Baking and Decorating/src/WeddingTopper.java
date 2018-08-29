
public class WeddingTopper extends ToppingsDecorator{
	Cake cake;
	
	public WeddingTopper (Cake cake) {
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Wedding Toppers";
	}
	
	public double	cost() {
		return cake.cost() + 1000.00;
	}
}
