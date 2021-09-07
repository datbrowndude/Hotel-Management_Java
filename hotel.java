package covid_care_management;
import java.util.Scanner;

public class hotel {
static hotel_owner hotel_obj=new hotel_owner();
static Scanner sc = new Scanner(System.in);

static void get_cust_details(int i, int rn) {
	 String name, contact, gender;
     String name2 = null, contact2 = null; 
     String gender2="";
     System.out.print("\nEnter customer name: ");
     name = sc.next();
     System.out.print("Enter contact number: ");
     contact=sc.next();
     System.out.print("Enter gender: ");
     gender = sc.next();
     if(i<3)
     {
     System.out.print("Enter second customer name: ");
     name2 = sc.next();
     System.out.print("Enter contact number: ");
     contact2=sc.next();
     System.out.print("Enter gender: ");
     gender2 = sc.next();
     
     switch (i) {
     case 1:hotel_obj.luxury_doubleroom[rn]=new double_room(name,contact,gender,name2,contact2,gender2);
         break;
     case 2:hotel_obj.deluxe_doubleroom[rn]=new double_room(name,contact,gender,name2,contact2,gender2);
         break;
     case 3:hotel_obj.luxury_singleroom[rn]=new single_room(name,contact,gender);
         break;
     case 4:hotel_obj.deluxe_singleroom[rn]=new single_room(name,contact,gender);
         break;
     default:System.out.println("Wrong option");
         break;
 }
 }      
 }
	
	static void book_room(int i) {

		
		int rn;
		System.out.println("Choose rooms from");
		switch(i) {
		case 1:
			for(int j=0;j<hotel_obj.luxury_doubleroom.length;j++) {
				if(hotel_obj.luxury_doubleroom[j]==null) {
					System.out.print(j+1+",");
				}
			}
		System.out.println("pick from available luxury double rooms");
		
		 try{
             rn=sc.nextInt();
             rn--;
             if(hotel_obj.luxury_doubleroom[rn]!=null)
             { throw new not_available();}
             get_cust_details(i,rn);
             }
             catch(Exception e)
             {
                 System.out.println("Invalid Option");
                 return;
             }
		 break;
		
		case 2: 
			for(int j=0;j<hotel_obj.deluxe_doubleroom.length;j++) {
				if(hotel_obj.deluxe_doubleroom[j]==null) {
					System.out.print(j+11+",");
				}
			}
		System.out.println("choose from available deluxe doublerooms");
		
			try {
				rn=sc.nextInt();
				rn-=11;
				if(hotel_obj.deluxe_doubleroom[rn]!=null) {
					throw new not_available();
				}
				get_cust_details(i,rn);
			}
			
			catch(Exception e){
				 System.out.println("Invalid Option");
                 return;
			}
			
			break;
	
		case 3:
			for(int j=0;j<hotel_obj.luxury_singleroom.length;j++) {
				if(hotel_obj.luxury_singleroom[j]==null) {
					System.out.print(j+31+",");
				}
			}
			System.out.println("choose from available luxury singlerooms");
			try {
				rn=sc.nextInt();
				rn=rn-31;
				if(hotel_obj.luxury_singleroom[rn]!=null) {
					throw new not_available();
				
				}
				get_cust_details(i,rn);
			}
			
			catch(Exception e){
				 System.out.println("Invalid Option");
                 return;
			}
		
			break;
		
		case 4:
			
			for(int j=0;j<hotel_obj.luxury_doubleroom.length;j++) {
				if(hotel_obj.luxury_doubleroom[j]==null) {
					System.out.print(j+41+",");
				}
			}
			System.out.println("choose from available luxury doublerooms");
			try {
				rn=sc.nextInt();
				rn-=41;
				if(hotel_obj.luxury_doubleroom[rn]!=null) {
					throw new not_available();
				
				}
				get_cust_details(i,rn);
			}
			
			catch(Exception e){
				 System.out.println("Invalid Option");
                 return;
			}
			
			break;
			
		  default:
              System.out.println("Enter valid option");
              break;
		}
		System.out.println("Room Booked");
		
		}
	static void show_features(int i) {
		switch(i) {
		case 1: System.out.println("luxury_doubleroom:\n Beds:2\n AC:YES\n Charge_per_day:4000\n TV:YES\n HotWater:YES\n");
		break;
		
		case 2: System.out.println("deluxe_doubleroom:\n Beds:4\n AC:YES\n Charge_per_day:600\n TV:YES\n HotWater:YES\n number of free meals: 2 per head\n");
		break;
		
		case 3: System.out.println("luxury_singleroom:\n Beds:1\n AC:NO\n Charge_per_day:100\n TV:YES\n ");
		break;
		
		case 4: System.out.println("deluxe_singleroom:\n Beds:1\n AC:NO\n Charge_per_day:300\n TV:YES\n HotWater:YES\n number of free meals: 1 per head\\n");
		break;
		}

	}
	static void availability(int i)
	    {
	      int j,count=0;
	        switch (i) {
	            case 1:
	                for(j=0;j<10;j++)
	                {
	                    if(hotel_obj.luxury_doubleroom[j]==null)
	                        count++;
	                }
	                break;
	            case 2:
	                for(j=0;j<hotel_obj.deluxe_doubleroom.length;j++)
	                {
	                    if(hotel_obj.deluxe_doubleroom[j]==null)
	                        count++;
	                }
	                break;
	            case 3:
	                for(j=0;j<hotel_obj.luxury_singleroom.length;j++)
	                {
	                    if(hotel_obj.luxury_singleroom[j]==null)
	                        count++;
	                }
	                break;
	            case 4:
	                for(j=0;j<hotel_obj.deluxe_singleroom.length;j++)
	                {
	                    if(hotel_obj.deluxe_singleroom[j]==null)
	                        count++;
	                }
	                break;
	            default:
	                System.out.println("Enter valid option");
	                break;
	        }
	        System.out.println("Number of rooms available : "+count);
	    }
	static void bill(int rn,int rtype)
    {
        double amount=0;
        String list[]={"veg thali","paneer thali","non veg thali","tea/coffee"};
        System.out.println("\n*******");
        System.out.println(" Bill:-");
        System.out.println("*******");
               
        switch(rtype)
        {
            case 1:
                amount+=4000;
                    System.out.println("\nRoom Charge - "+4000);
                    System.out.println("\n===============");
                    System.out.println("Food Charges:- ");
                    System.out.println("===============");
                     System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(food obb:hotel_obj.luxury_doubleroom[rn].foodlist)
                    {
                        amount+=obb.price;
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                    }
                    
                break;
            case 2:amount+=3000;
                    System.out.println("Room Charge - "+3000);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                     System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(food obb:hotel_obj.deluxe_doubleroom[rn].foodlist)
                    {
                        amount+=obb.price;
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                    }
                break;
            case 3:amount+=2200;
                    System.out.println("Room Charge - "+2200);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(food obb:hotel_obj.luxury_singleroom[rn].foodlist)
                    {
                        amount+=obb.price;
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                    }
                break;
            case 4:amount+=1200;
                    System.out.println("Room Charge - "+1200);
                    System.out.println("\nFood Charges:- ");
                    System.out.println("===============");
                    System.out.println("Item   Quantity    Price");
                    System.out.println("-------------------------");
                    for(food obb: hotel_obj.deluxe_singleroom[rn].foodlist)
                    {
                        amount+=obb.price;
                        String format = "%-10s%-10s%-10s%n";
                        System.out.printf(format,list[obb.itemno-1],obb.quantity,obb.price );
                    }
                break;
            default:
                System.out.println("Not valid");
        }
        System.out.println("\nTotal Amount- "+amount);
    }
	static void deallocate_room(int rn, int rtype) {
		int j;
        char w;
        switch (rtype) {
            case 1:               
                if(hotel_obj.luxury_doubleroom[rn]!=null)
                    System.out.println("Room used by "+hotel_obj.luxury_doubleroom[rn].name);                
                else 
                {    
                    System.out.println("Empty Already");
                        return;
                }
                System.out.println("Do you want to checkout ?(y/n)");
                 w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_obj.luxury_doubleroom[rn]=null;
                    System.out.println("Deallocated succesfully");
                }
                
                break;
            case 2:
                if(hotel_obj.deluxe_doubleroom[rn]!=null)
                    System.out.println("Room used by "+hotel_obj.deluxe_doubleroom[rn].name);                
                else 
                {    
                    System.out.println("Empty Already");
                        return;
                }
                System.out.println(" Do you want to checkout ?(y/n)");
                 w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_obj.deluxe_doubleroom[rn]=null;
                    System.out.println("Deallocated succesfully");
                }
                 
                break;
            case 3:
                if(hotel_obj.luxury_singleroom[rn]!=null)
                    System.out.println("Room used by "+hotel_obj.luxury_singleroom[rn].name);                
                else 
                 {    
                    System.out.println("Empty Already");
                        return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_obj.luxury_singleroom[rn]=null;
                    System.out.println("Deallocated succesfully");
                }
                
                break;
            case 4:
                if(hotel_obj.deluxe_singleroom[rn]!=null)
                    System.out.println("Room used by "+hotel_obj.deluxe_singleroom[rn].name);                
                else 
                 {    
                    System.out.println("Empty Already");
                        return;
                }
                System.out.println(" Do you want to checkout ? (y/n)");
                 w=sc.next().charAt(0);
                if(w=='y'||w=='Y')
                {
                    bill(rn,rtype);
                    hotel_obj.deluxe_singleroom[rn]=null;
                    System.out.println("Deallocated succesfully");
                }
                break;
            default:
                System.out.println("\nEnter valid option : ");
                break;
        }
	}
	static void orders(int rn, int rtype) {
		 int i,q;
	        char wish;
	         try{
	             System.out.println("\n==========\n   Menu:  \n==========\n\n1.Veg thali\tRs.50\n2.Paneer thali\t\tRs.90\n3.Non veg thali\tRs.120\n4.Tea/Coffee\t\tRs.15\n");
	        do
	        {
	            i = sc.nextInt();
	            System.out.print("Quantity- ");
	            q=sc.nextInt();
	           
	              switch(rtype){
	            case 1: hotel_obj.luxury_doubleroom[rn].foodlist.add(new food(i,q));
	                break;
	            case 2: hotel_obj.deluxe_doubleroom[rn].foodlist.add(new food(i,q));
	                break;
	            case 3: hotel_obj.luxury_singleroom[rn].foodlist.add(new food(i,q));
	                break;
	            case 4: hotel_obj.deluxe_singleroom[rn].foodlist.add(new food(i,q));
	                break;                                                 
	        }
	              System.out.println("Do you want to order anything else ? (y/n)");
	              wish=sc.next().charAt(0); 
	        }while(wish=='y'||wish=='Y');  
	        }
	         catch(NullPointerException e)
	            {
	                System.out.println("\nRoom not booked");
	            }
	         catch(Exception e)
	         {
	             System.out.println("Cannot be done");
	         }
	    }
	
}

	
	
	
	

