package org.bike;

public class ktm implements Bike{
	
	@Override
	public void cost() {
		System.out.println("The cost is 1,85,000");
	}
	@Override
	public void speed() {
		System.out.println("Speed limit upto 240kmph");
	}
	public static void main(String[] args) {
		ktm ktm=new ktm();
		ktm.cost();
		ktm.speed();
	}
}
