
public class VinillaIcing extends ToppingsDecorator{
	Cake cake;
	
	public VinillaIcing(Cake cake){
		this.cake = cake;
	}
	
	public String getDescription() {
		return cake.getDescription() + ", Vinilla Icing";
	}
	
	public double cost() {
		return cake.cost() + 1.99;
	}
}
