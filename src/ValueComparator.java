import java.util.Comparator;

public class ValueComparator implements Comparator<Valuables> {
	
	public int compare (Valuables v1, Valuables v2) {
		
		return v2.getValue().compareTo(v1.getValue());
		
	}
	
}
