
// Extending ToppingsDecorator from Cake allows it to have the
// same type. Which is needed in a decorator. However, you
// could use an interface instead of an abstract class.
public abstract class ToppingsDecorator extends Cake {
	public abstract String getDescription();
}
