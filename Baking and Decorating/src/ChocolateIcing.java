
public class ChocolateIcing extends ToppingsDecorator{
	// an instance variable to hold the cake we are wrapping.
	Cake cake;
	
	// Here we pass a cake to the constructor of ChocolateIcing
	// so when we call it later ChocolateIcing knows what cake
	// to work with.
	public ChocolateIcing(Cake cake) {
		// A way to set this instance variable to the object
		// we are wrapping. Here we are going to pass the 
		// cake we are wrapping to the decorator's constructor.
		this.cake = cake;
	}
	
	public String getDescription() {
		// We want our description to include each item decorating
		// the cake. So we delegate to the object we are decorating
		// then we add Chocolate Icing to its description.
		return cake.getDescription() + ", Chocolate Icing";
	}
	
	public double cost() {
		// Now compute the cost of the cake with chocolate icing.
		// first delegate the call to the object we are decorating
		// so it can compute the cost, then add the cost of
		// chocolate icing to the result.
		return 2.00 + cake.cost();
	}
}
