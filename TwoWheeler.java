package week1.day1;

public class TwoWheeler {
	int noOfWheels= 2;
	short noOfMirrors= 1;
	long chassisNumber= 9877897L;
	boolean isPunctured=false;
	String bikeName= "Pulsar";
	double runningKM= 34567.7;
	
		public static void main(String[] args) {
		//bd means bike details
TwoWheeler bd= new TwoWheeler();
System.out.println("Bike Features:");
System.out.println("noOfWheels="+ bd.noOfWheels);
System.out.println("noOfMirrors="+ bd.noOfMirrors);
System.out.println("chassisNumber="+ bd.chassisNumber);
System.out.println("isPunctured="+ bd.isPunctured);
System.out.println("bikeName="+ bd.bikeName);
System.out.println("runningKM="+ bd.runningKM);

	}

}
