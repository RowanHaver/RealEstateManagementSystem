import java.io.*;
import java.util.*; // which includes util.Scanner and util.ArrayList

/*
public class Person implements Serializable {

    static ArrayList<Property> props = new ArrayList<Property>(); // creates variable props of type arraylist that stores property
    static ArrayList<Tenant> tents = new ArrayList<Tenant>(); // creating tents arraylist of type Tenant
    static ArrayList<Lease> lease = new ArrayList<Lease>();

    private static void initializeProperties() { // creating the initial property list
        Property p0 = new Property("House", 4, 4, 3600, "UAE", "Dubai", "Arabian-Ranches", "al mira 4", 53,01);
        // new property creates new object called p0,    values being passed to constructor
        props.add(p0);// adding objects containing already present values


        Property p1 = new Property("Apartment", 5, 4, 4500, "UAE", "Dubai", "Marina", "Princess tower", 54, 01);
        props.add(p1);// adding objects containing already present values

    }




    public static void printProperties() {
        //System.out.format("%15s %10d %10d %15d %20s %20s %20s %12s %18s %10d ",propertyType,bedrooms,bathrooms,squareFeet,country,city,location,firstName,status,rent);
        Property p;
        // formats the length and prints above
        System.out.format("%15s %10s %10s %15s %20s %20s %20s %12s %18s %10s","Property type", "Bedrooms","Bathrooms","Square Feet","Country","City","Address","Street","Number","PropertyID");
        for (int i = 0; i < props.size(); i++) { // for loop and checks if i is below the props arraylist size
            System.out.println("");
            p = props.get(i); //props.get gets the element of a specified index(i) within the list
            p.printProperty(); // calls printProperty method in Property class
        }
    }





    public static void main(String[] args) {
        //initializeProperties();
        //writeProperty();
        readProperty();
        addProperties();


    }





    public static void readProperty(){
        try{
            FileInputStream readData = new FileInputStream("propertyData");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            props = (ArrayList<Property>) readStream.readObject();

            readStream.close();
            printProperties();
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeProperty(){
        //write to file
        try{
            FileOutputStream writeData = new FileOutputStream("propertyData");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(props);
            writeStream.flush();
            writeStream.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void delete(){
        Scanner scanInput = new Scanner(System.in);
        System.out.println("First property begins with 0, Enter number to delete: "); // asks user for input in which tenant to delete
        int i = scanInput.nextInt();
        props.remove(i); // removes property array with users input
        writeProperty();
        readProperty();
    }


    private static void addProperties() { // add properties method
        Scanner scanInput = new Scanner(System.in);

        System.out.println("Enter property type: ");
        String houseType = scanInput.next(); // assigns input to houseType

        System.out.println("Enter bedrooms amount: ");
        int bedrooms = scanInput.nextInt();

        System.out.println("Enter bathroom amount: ");
        int bathrooms = scanInput.nextInt();

        System.out.println("Enter square feet amount: ");
        int squareFeet = scanInput.nextInt();

        System.out.println("Enter country: ");
        String country = scanInput.next();

        System.out.println("Enter city: ");
        String city = scanInput.next();

        System.out.println("Enter Address: ");
        String address = scanInput.next();

        System.out.println("Enter Street: ");
        String street = scanInput.next();

        System.out.println("Enter property number: ");
        int number = scanInput.nextInt();

        System.out.println("Enter Property ID: ");
        int propertyID = scanInput.nextInt();
        //propertyType,bedrooms,bathrooms,squareFeet,country,city,address,street,number,propertyID

        Property p3 = new Property(houseType, bedrooms, bathrooms, squareFeet, country, city, address, street,number, propertyID);
        // declaring object containing users input.
        props.add(p3); // adding object to arraylist
        writeProperty();
        readProperty();
    }
}






    static ArrayList<Property> props = new ArrayList<Property>(); // creates variable props of type arraylist that stores property
    static ArrayList<Tenant> tents = new ArrayList<Tenant>(); // creating tents arraylist of type Tenant

    private static void initializeProperties() { // creating the initial property list
        Property p0 = new Property("House", 4, 4, 3600, "UAE", "Dubai", "Arabian-Ranches", "Edwin", "Occupied", 180000);
        // new property creates new object called p0,    values being passed to constructor
        props.add(p0);// adding objects containing already present values

        Property p1 = new Property("Apartment", 5, 4, 4500, "UAE", "Dubai", "Marina", "Joe", "Occupied", 220000);
        props.add(p1);// adding objects containing already present values

    }

    private static void initializeTenants() { // initialize tenants
        Tenant t0 = new Tenant("Carlson","0526742897","carlson56@gmail.com",73828355,"Rowan","04-08-18");
        tents.add(t0); // adding objects containing already present values
        Tenant t1 = new Tenant("Sanchez","0556741875","Sanchez@gmail.com",2536362,"Rowan","02-06-20");
        tents.add(t1); // adding objects containing already present values
    }





    public static void main (String[]args){ // main
        initializeTenants();
        initializeProperties();
        mainMenu(); // calling mainMenu to start the program

    }
    // to print
    Property p; p = props.get(i); p.printProperty();

    // to add
    Property p2 = new Property(houseType, bedrooms, bathrooms, squareFeet, country, city, location, firstName, status, rent);
        // declaring object containing users input.
        props.add(p2); // adding object to arraylist


           Property p;
        Tenant t;
        // formats the length and prints above
        System.out.format("%15s %10s %10s %15s %20s %20s %20s %12s %18s %10s","Property type", "Bedrooms","Bathrooms","Square Feet","Country","City","Address","First Name","Property status","Rent");
        for (int i = 0; i < props.size(); i++) { // for loop and checks if i is below the props arraylist size
            System.out.println("");
            p = props.get(i); //props.get gets the element of a specified index(i) within the list
            t = tents.get(i);
            p.printProperty(); // calls printProperty method in Property class
            System.out.println(t.lastName);
        }

 */


