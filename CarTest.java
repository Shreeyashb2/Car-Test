
public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car newObj = new Car();
		newObj.toyota();
		newObj.toyota(2993);
		newObj.toyota("Supra", 2993);
		newObj.toyota("JDM(Japan Designed MAnufacturer)", 2993);
	}
}

class Car{
	void toyota(){
		System.out.println("Welcome to Toyota Manufacturers");
	}
	void toyota(String name, int cc) {
		System.out.println("This "+ name+ " model of Toyota has a engine of "+cc+ "cc.");
}
	void toyota(int cc) {
		System.out.println("This Toyota car model has a "+cc+ "cc Engine");
	}
	void toyota(String manufacturer, String speed) {
		System.out.println("As this model is a "+ manufacturer+ " based so its top speed is almost "+ speed+" Miles per Hour");
	}
	
}
