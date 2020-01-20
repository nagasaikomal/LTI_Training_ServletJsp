
public class Vehicle {
	int vehId;
	String vehName;
	public Vehicle(int vehId, String vehName) {
		super();
		this.vehId = vehId;
		this.vehName = vehName;
	}
	public int getVehId() {
		return vehId;
	}
	public void setVehId(int vehId) {
		this.vehId = vehId;
	}
	public String getVehName() {
		return vehName;
	}
	public void setVehName(String vehName) {
		this.vehName = vehName;
	}
	@Override
	public String toString() {
		return "Vehicle [vehId=" + vehId + ", vehName=" + vehName + "]";
	}
	

}

