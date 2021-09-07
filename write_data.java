package covid_care_management;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class write_data implements Runnable {

	hotel_owner hotel_ob;
    write_data(hotel_owner hotel_ob)
    {
        this.hotel_ob=hotel_ob;
    }
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		  try{
		        FileOutputStream fout=new FileOutputStream("backup");
		        ObjectOutputStream oos=new ObjectOutputStream(fout);
		        oos.writeObject(hotel_ob);
		        }
		        catch(Exception e)
		        {
		            System.out.println("Error in writing data. Type: "+e);
		        }        
	}

}
