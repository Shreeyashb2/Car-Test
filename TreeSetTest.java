import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		System.out.println("Welcome to Periodic Table...");
		ChemicalElements ce1 = new ChemicalElements(1, 1.00797f,"H","Hydrogen");
		ChemicalElements ce2 = new ChemicalElements(79, 196.9665f,"Au","Gold");
		ChemicalElements ce3 = new ChemicalElements(3, 0.42f,"Br","Lithium");
		ChemicalElements ce4 = new ChemicalElements(23, 0.65f,"B","Vanadium");
		ChemicalElements ce5 = new ChemicalElements(45, 0.65f,"B","Rhodium");
		
		TreeSet<ChemicalElements> periodTable = new TreeSet<ChemicalElements>();
		System.out.println("Preparation is done...");
		
		System.out.println("Adding the 1st Element...");
		periodTable.add(ce1);
		
		System.out.println("Adding the 2nd Element...");
		periodTable.add(ce2);
		
		System.out.println("Adding the 3rd Element...");
		periodTable.add(ce3);
		
		System.out.println("Adding the 4th Element...");
		periodTable.add(ce4);
		
		System.out.println("Adding the 5th Element...");
		periodTable.add(ce5);
		
		Iterator<ChemicalElements> setIterator = periodTable.iterator();
		while (setIterator.hasNext()) {
			ChemicalElements theElement = setIterator.next();
			System.out.println("The Element : "+ theElement);
		}
	}
	
}

class ChemicalElements implements Comparable<ChemicalElements>
{
	int atomicNumber;
	float atomicWeight;
	String atomicFormula;
	String atomicName;
	public ChemicalElements(int atomicNumber, float atomicWeight, String atomicFormula, String atomicName) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
		this.atomicFormula = atomicFormula;
		this.atomicName = atomicName;
	}
	@Override
	public String toString() {
		return "ChemicalElements [atomicNumber=" + atomicNumber + ", atomicWeight=" + atomicWeight + ", atomicFormula="
				+ atomicFormula + ", atomicName=" + atomicName + "]";
	}
	@Override
	public int compareTo(ChemicalElements o) {
		System.out.println("Comparing "+atomicNumber+ " with "+o.atomicNumber);
		return Integer.compare(atomicNumber, o.atomicNumber);
	}
	
	
	
	
}

