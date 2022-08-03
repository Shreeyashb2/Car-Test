
public class GenericTest3 
{
	public static void main(String[] args) 
	{
		CarSwapper<String> cr = new CarSwapper<String>("Toyota", "Supra");
		cr.print();
		cr.swap();
		cr.print();
	
		CarColour<String> cc = new CarColour<String>("LIGHT GREY", "MATTE");
		cc.print();
		cc.swap();
		cc.print();
	}

}
class CarSwapper<T>
{ //=======> CONTAINER
	T name;
	T model;
	public CarSwapper(T name, T model) 
	{
		super();
		this.name = name;
		this.model = model;
	}
	
	void print() 
	{
		System.out.println("Car Name is "+ name);
		System.out.println("Car Model is "+model);
	}
	
	void swap() 
	{
		System.out.println("Swapping the Name with Model.....");
		T name_swap = name;
		name = model;
		model = name_swap;
		System.out.println("Swapping Done.....");
	}
	
}

class CarColour<colors>
{
	colors clr;
	colors clr_type;
	public CarColour(colors clr, colors clr_type) 
	{
		super();
		this.clr = clr;
		this.clr_type = clr_type;
	}
	
	void print() 
	{
		System.out.println("Printing your defined type of color and its colortype....");
		System.out.println("Your Defined Color : "+clr);
		System.out.println("Your Defined Color Type  : "+clr_type);		
	}
	void swap() 
	{
		colors color_swap = clr;
		clr = clr_type;
		clr_type = color_swap;
		System.out.println("Swapping Done.....");
	}
}