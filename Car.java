 class Car{
	private int year;
	private String make;
	private double speed;
	
	Car(int y, String m , double s){
		this.year = y;
		this.make = m;
		this.speed = s;
	}
	public int getYear(){
		return year;
	}
	public String getMake(){
		return make;
	}
	public double getSpeed (){
		System.out.println("Speed is "+this.speed+ "mph");
		return speed;
	}
	void Accelerate(){
		speed = speed+1;
	}
}