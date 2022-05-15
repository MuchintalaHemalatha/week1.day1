package week1.day1;

public class Car {

	
		
		public void applyBreak() {
				System.out.println("Apply Break");
		}
		public void applyGear() {
			System.out.println("Apply Gear");
	}
		public void switchonAc() {
			System.out.println("switch on Ac");
	}
		public void applyAccelerate() {
			System.out.println("apply Accelerate");
	}
	
		public static void main(String[] args) {
			System.out.println("Car features");
			//cd means cardetails
			Car cd= new Car();
			cd.applyBreak();
			cd.applyGear();
			cd.switchonAc();
			cd.applyAccelerate();
			
		}

		
}
