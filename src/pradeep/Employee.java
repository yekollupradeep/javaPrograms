package pradeep;

public class Employee {
	String empName;
	String city;
	int age;
	long phNo;
	public Employee(String empName, String city, int age, long phNo) {
		this.empName=empName;
		this.city = city;
		this.age=age;
		this.phNo = phNo;
	}
	public String getEmpName() {
		return empName;
	}
	public String getCity() {
		return city;
	}
	public int getAge() {
		return age;
	}
	public long getPhNo() {
		return phNo;
	}
	
}
