import java.util.Comparator;

public class NameComparator implements Comparator<Valuables> {
	
	public int compare (Valuables v1, Valuables v2) {

		return v1.getName().compareToIgnoreCase(v2.getName());
	}


}
