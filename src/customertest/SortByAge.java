package customertest;

import java.util.Comparator;

public class SortByAge implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();

}
}