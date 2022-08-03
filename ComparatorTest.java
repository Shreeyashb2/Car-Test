import java.util.Comparator;

public class ComparatorTest {
	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("  Comparator Interface");
		System.out.println("=========================");
		
		TypesofIronFormation fe1 = new TypesofIronFormation("Ferrite",0.8f,750);
		TypesofIronFormation fe2 = new TypesofIronFormation("Austenite",2.0f,1150);
		TypesofIronFormation fe3 = new TypesofIronFormation("Ledeburite",4.57f,1150);
		
		
		
	}
}
class TypesofIronFormation implements Comparator<TypesofIronFormation>
{
	String phaseName;
	float carbonContent;
	int temperature;
	public TypesofIronFormation(String phaseName, float carbonContent, int temperature) {
		super();
		this.phaseName = phaseName;
		this.carbonContent = carbonContent;
		this.temperature = temperature;
	}
	@Override
	public String toString() {
		return "TypesofIronFormation [phaseName=" + phaseName + ", carbonContent=" + carbonContent + ", temperature="
				+ temperature + "]";
	}
	@Override
	public int compare(TypesofIronFormation o1, TypesofIronFormation o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	
	
	
	
}