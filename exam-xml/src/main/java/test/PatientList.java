package test;

import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
@XStreamAlias("PatientList")
public class PatientList {
	
	@XStreamImplicit
	    private List<Patients> list;

	    public PatientList(){
	        list = new ArrayList<Patients>();
	    }

	    public void add(Patients p){
	        list.add(p);
	    }
	    public void display() {
	    	for (Patients patients : list) {
				System.out.println(patients);
			}
	    }
	    public List<Patients> getPatients() {
	        return list;
	    }

	    public void setPatients(List<Patients> patients) {
	        this.list = patients;
	    }
}
