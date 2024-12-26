package entity;

public class National {
	private int nationalId;
	private String nationalName;
	
	public National(int nationalId, String nationalName) {
		super();
		this.nationalId = nationalId;
		this.nationalName = nationalName;
	}

	public int getNationalId() {
		return nationalId;
	}

	public void setNationalId(int nationalId) {
		this.nationalId = nationalId;
	}

	public String getNationalName() {
		return nationalName;
	}

	public void setNationalName(String nationalName) {
		this.nationalName = nationalName;
	}

	@Override
	public String toString() {
		return "National [nationalId=" + nationalId + ", nationalName=" + nationalName + "]";
	}
	
}
