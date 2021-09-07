package covid_care_management;

import java.io.Serializable;
import java.util.ArrayList;

public class single_room implements Serializable{
String name;
String contact;
String gender;
ArrayList<food> foodlist=new ArrayList<>();
single_room(){
	this.name="";
}
	public single_room(String name,String contact,String gender) {
		this.contact=contact;
		this.gender=gender;
		this.name=name;
	}
}
