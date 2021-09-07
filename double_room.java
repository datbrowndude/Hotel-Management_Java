package covid_care_management;

import java.io.Serializable;
import java.util.ArrayList;

public class double_room extends single_room implements  Serializable{
	String name2;
    String contact2;
    String gender2;  
    double_room(){
    	
    }

 double_room(String name,String contact,String gender,String name2,String contact2,String gender2) {
	 this.name=name;
     this.contact=contact;
     this.gender=gender;
     this.name2=name2;
     this.contact2=contact2;
     this.gender2=gender2;
}
	
	
	
}
