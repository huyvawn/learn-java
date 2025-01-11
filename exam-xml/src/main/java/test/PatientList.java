package test;

import java.util.ArrayList;
import java.util.List;

public class PatientList {
	

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
	
}
