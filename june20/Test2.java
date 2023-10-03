package june20;

class Employee {
	private int id;
	private String name;
	private String mobile;
	private String email;
	private String desig;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + ", email=" + email + ", desig=" + desig
				+ ", salary=" + salary + "]";
	}
}
public class Test2 {
	public static void main(String[] args) {
		Employee[] employees=new Employee[5];
		
		Employee obj=new Employee();
		obj.setId(101);
		obj.setName("Kushagra");
		obj.setMobile("9876545678");
		obj.setDesig("Java Developer");
		obj.setSalary(35000);
		
		
		Employee employee1=new Employee();
		employee1.setId(102);
		employee1.setName("Harsh");
		employee1.setMobile("9876545678");
		employee1.setDesig("Web Developer");
		employee1.setSalary(30000);
		
		
		employees[0]=obj;
		employees[1]=employee1;
		
		for(int i=0;i<2;i++) {
			System.out.println(employees[i].getId());
			System.out.println(employees[i].getName());
			System.out.println(employees[i].getMobile());
			System.out.println(employees[i].getEmail());
			System.out.println(employees[i].getDesig());
			System.out.println(employees[i].getSalary());
		}
		
		
	}
}
