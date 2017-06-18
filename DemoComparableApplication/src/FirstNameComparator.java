
import java.util.*;

class FirstNameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		Customer c1 = (Customer) o1;
		Customer c2 = (Customer) o2;

		return c1.getFirstName().compareTo(c2.getFirstName());
	}

}