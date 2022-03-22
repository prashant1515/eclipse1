package customertest;

import java.util.*;

public class Ui {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
			Set<Customer>s=new TreeSet<Customer>(new SortByAge());
			Customer cr[]=new Customer[4];
			for(int i=0;i<4;i++) {
				System.out.println("enter firstname of customer");
				String fname=scan.next();
				System.out.println("enter lname of customer");
				String lname=scan.next();
				System.out.println("enter age");
				int age=scan.nextInt();
				System.out.println("enter customerid");
				int customerid=scan.nextInt();
				Customer c=new Customer(fname,lname,age,customerid);
				s.add(c);
				
			}
			System.out.println("enter customer id");
			int customerid1=scan.nextInt();
			for(Customer r:s) {
				if(r.getCustomerId()==customerid1) {
					System.out.println(r);
				}
			}
			System.out.println(s);
			

	}

}
