package covid_care_management;

import java.io.Serializable;

public class food implements Serializable{
int itemno;
String dish;
int price;
int quantity;
public food(int itemno,int quantity) {
	this.itemno=itemno;
	this.quantity=quantity;
	switch(itemno) {
	case 1: price=quantity*50;
	break;   //veg thali
	case 2: price=quantity*90; 
	break;   //paneer thali
	case 3: price=quantity*120; 
	break;   //non veg thali
	case 4: price=quantity*15; 
	break;  //tea or coffee
	}
}
	
	
}
