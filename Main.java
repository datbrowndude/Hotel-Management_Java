package covid_care_management;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		try {
			File f= new File("database");
			if(f.exists()) {
				FileInputStream fin=new FileInputStream(f);
				ObjectInputStream ois=new ObjectInputStream(fin);
				hotel.hotel_obj=(hotel_owner)ois.readObject();
				
			}
			Scanner sc = new Scanner(System.in);
	        int ch,ch2;
	        char wish;
	        x:
	        	do{

	                System.out.println("\nEnter your choice :\n1.Display room details\n2.Display room availability \n3.Book\n4.Order food\n5.Checkout\n6.Exit\n");
	                ch = sc.nextInt();
	                switch(ch){
	                    case 1: System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room \n4.Deluxe Single Room\n");
	                            ch2 = sc.nextInt();
	                            hotel.show_features(ch2);
	                        break;
	                    case 2:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
	                             ch2 = sc.nextInt();
	                             hotel.availability(ch2);
	                        break;
	                    case 3:System.out.println("\nChoose room type :\n1.Luxury Double Room \n2.Deluxe Double Room \n3.Luxury Single Room\n4.Deluxe Single Room\n");
	                             ch2 = sc.nextInt();
	                             hotel.book_room(ch2);                     
	                        break;
	                    case 4:
	                         System.out.print("Room Number -");
	                             ch2 = sc.nextInt();
	                             if(ch2>60)
	                                 System.out.println("Room doesn't exist");
	                             else if(ch2>40)
	                                 hotel.orders(ch2-41,4);
	                             else if(ch2>30)
	                                 hotel.orders(ch2-31,3);
	                             else if(ch2>10)
	                                 hotel.orders(ch2-11,2);
	                             else if(ch2>0)
	                                 hotel.orders(ch2-1,1);
	                             else
	                                 System.out.println("Room doesn't exist");
	                             break;
	                    case 5:                 
	                        System.out.print("Room Number -");
	                             ch2 = sc.nextInt();
	                             if(ch2>60)
	                                 System.out.println("Room doesn't exist");
	                             else if(ch2>40)
	                                 hotel.deallocate_room(ch2-41,4);
	                             else if(ch2>30)
	                                 hotel.deallocate_room(ch2-31,3);
	                             else if(ch2>10)
	                                 hotel.deallocate_room(ch2-11,2);
	                             else if(ch2>0)
	                                 hotel.deallocate_room(ch2-1, 1);
	                             else
	                                 System.out.println("Room doesn't exist");
	                             break;
	                    case 6:break x;
	                }
	                System.out.println("\nContinue : (y/n)");
	                wish=sc.next().charAt(0); 
	                if(!(wish=='y'||wish=='Y'||wish=='n'||wish=='N'))
	                {
	                    System.out.println("Invalid Option");
	                    System.out.println("\nContinue : (y/n)");
	                    wish=sc.next().charAt(0); 
	                }
	                }
	        	
	        	
	             while(wish=='y'||wish=='Y');    
	        
	        		Thread t=new Thread(new write_data(hotel.hotel_obj));
	        		t.start();
	        }        
	            catch(Exception e)
	            {
	                System.out.println("Not a valid input");
	            }
	    }
}