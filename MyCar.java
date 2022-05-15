package week1.day1;

public class MyCar {

	
		//we can call any class with in the package by creating a object for that existing class 
	
		public static void main(String[] args) {
			System.out.println("Car features");
			//cd means cardetails
			Car MyCar= new Car();
			MyCar.applyBreak();
			MyCar.applyGear();
			MyCar.switchonAc();
			MyCar.applyAccelerate();
			
		}

		
}



