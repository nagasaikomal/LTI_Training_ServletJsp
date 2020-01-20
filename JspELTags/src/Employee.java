
public class Employee {

	int empId;
	String empName;
	int empSal;
	Vehicle v;
	public Employee(int empId, String empName, int empSal, Vehicle v) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.v = v;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public Vehicle getV() {
		return v;
	}
	public void setV(Vehicle v) {
		this.v = v;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", v=" + v + "]";
	}
	
}
