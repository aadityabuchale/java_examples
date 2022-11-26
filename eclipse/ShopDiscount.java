package control_statements;

public class ShopDiscount {
	void Discount(int q) {
		int price= q*100;
		if(price>=1000) {
			System.out.println("Congratulations You get 10% Discount on "+price+" \nYour final Amount is :"+(price-(0.1*price)));
		}
		else {
			System.out.println("your Total amount is "+price);
			System.out.println("if you purchase of "+(1000-price)+"Rs, then You can get 10% off on Your Purchase");
		}	
	}
	public static void main(String[] args) {
		new ShopDiscount().Discount(11);
	}
}
