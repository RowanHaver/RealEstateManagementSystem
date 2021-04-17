import java.io.Serializable;
import java.util.Date;
import java.util.Formatter;
public class Lease {

        // declare instance variables
        // variable for each instance/object of a class
        int leaseID;
        int tenantID;
        Date startDate;
        Date endDate;
        int propertyID;
        int rent;


        //constructor (Create instance/object of a class)
        Lease(int leaseID, int tenantID, Date startDate, Date endDate, int propertyID, int rent){
            // object variable
            this.leaseID = leaseID; //setting the instance/object value to what is past in the constructor
            this.tenantID = tenantID;
            this.startDate = startDate;
            this.endDate = endDate;
            this.rent = rent;
            this.propertyID = propertyID;
        }

        void printProperty() { //prints all of the variables of the object
            System.out.format("%15s %10d %10d %15d %20s %20s %20s %12s %18s %10d ", leaseID, tenantID, startDate, endDate, rent, propertyID);
        }




}
