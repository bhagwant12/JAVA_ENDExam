

class RaceTrack{
	public static void main (String [] args){
		Car c = new Car(2015,"Hundai",30.99);
		System.out.println("Year of model is :"+c.getYear());
		System.out.println("Current Speed of car is  :"+c.getSpeed());
		
		c.Accelerate();
		System.out.println("Current Speed of car is  :"+c.getSpeed());
	}


}