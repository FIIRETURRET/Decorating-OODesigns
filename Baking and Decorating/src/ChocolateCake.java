
public class ChocolateCake extends Cake{
	public ChocolateCake() {
		// description is inherited from Cake
		description = "Chocolate Cake";
	}
	
	// The cost method is inherited from Cake. here we only
	// worry about the cost of chocolate cake without toppings.
	public double cost() {
		return 5.99;
	}
}
