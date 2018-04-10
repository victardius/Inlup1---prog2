import java.util.Comparator;

public class ValueComparator implements Comparator<Valuables> {
	
	public int compare (Valuables v1, Valuables v2) {
		
		
		return Double.compare(v2.getValue(), v1.getValue());
	
		
	}
	
}
