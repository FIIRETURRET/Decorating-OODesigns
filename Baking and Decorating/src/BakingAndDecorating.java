import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class BakingAndDecorating {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Cake cake = new ChocolateCake();
		System.out.println(cake.getDescription() + " $" + cake.cost());
		
		Cake cake2 = new VinillaCake();
		// Wrap it in chocolate Icing
		cake2 = new ChocolateIcing(cake2);
		System.out.println(cake2.getDescription() + " $" 
				+ cake2.cost());
		
		Cake cake3 = new RedVelvetCake();
		cake3 = new VinillaIcing(cake3);
		System.out.println(cake3.getDescription() + " $"
				+ cake3.cost());
		
		Cake cake4 = new RainbowCake();
		cake4 = new VinillaIcing(cake4);
		cake4 = new Strawberries(cake4);
		cake4 = new WeddingTopper(cake4);
		System.out.println(cake4.getDescription() + " $"
				+ cake4.cost());
		
		takeOrder();
	}
	
	public static void takeOrder() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Place your order: ");
		String s = br.readLine();
		System.out.println(s);
	}

}
