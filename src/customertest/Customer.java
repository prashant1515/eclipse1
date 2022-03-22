package customertest;
import java.util.Objects;

public class Customer{
	
	private String fname;
	
	private String lname;
	private int age;
	private int customerid;
	public Customer(String fname,String lname,int age,int customerid) {
			this.fname=fname;
			this.lname=lname;
			this.age=age;
			this.customerid=customerid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname=fname;
	}
	public void setLname(String lname) {
		this.lname=lname;
	}
	public String getLname() {
		return lname;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void setCustomerId(int custId) {
		this.customerid=custId;
	}
	public int getCustomerId() {
		return customerid;
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", age=" + age + ", customerid=" + customerid + "]";
	}
	@Override
	public int hashCode() {
		return this.fname.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		
		Customer other = (Customer) obj;
		if(other.fname.equals(this.fname) ){
			return true;
		}
		return false;
	}





}
