import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Property implements Serializable {
    // declare instance variables
    // variable for each instance/object of a class
    String propertyType;
    int bedrooms;
    int bathrooms;
    int squareFeet;
    String country;
    String city;
    String address;
    String street;
    int number;
    int propertyID;

    public Property(){
        this.propertyType="";
        this.bedrooms=0;
        this.bathrooms=0;
        this.squareFeet=0;
        this.country="";
        this.city="";
        this.address="";
        this.street="";
        this.number=0;
        this.propertyID=0;
    }


    //constructor (Create instance/object of a class)
    public Property(String propertyType,int bedrooms, int bathrooms, int squareFeet, String country, String city, String address, String street, int number, int propertyID){
        // object variable
        this.propertyType  = propertyType; //setting the instance/object value to what is past in the constructor
        this.bedrooms      = bedrooms;
        this.bathrooms     = bathrooms;
        this.squareFeet    = squareFeet;
        this.country       = country;
        this.city          = city;
        this.address      = address;
        this.street     = street;
        this.number        = number;
        this.propertyID = propertyID;
    }


    void printProperty() { //prints all of the variables of the object
        System.out.format("%15s %10d %10d %15d %20s %20s %20s %12s %18s %10d ",propertyType,bedrooms,bathrooms,squareFeet,country,city,address,street,number,propertyID);
    }

    public String getPropertyType(){
        return propertyType;
    }
    public void setPropertyType(String propertyType){
        this.propertyType=propertyType;
    }

    public int getBedrooms(){
        return bedrooms;
    }
    public void setBedrooms(int bedrooms){
        this.bedrooms=bedrooms;
    }

    public int getBathrooms(){
        return bathrooms;
    }
    public void setBathrooms(int bathrooms){
        this.bathrooms=bathrooms;
    }

    public int getSquareFeet(){
        return squareFeet;
    }
    public void setSquareFeet(int squareFeet){
        this.squareFeet=squareFeet;
    }

    public String getCountry(){
        return country;
    }
    public void setCountry(String country){
        this.country=country;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city=city;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }

    public String getStreet(){
        return street;
    }
    public void setStreet(String street){
        this.street=street;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number=number;
    }

    public int getPropertyID(){
        return propertyID;
    }
    public void setPropertyID(int propertyID){
        this.propertyID=propertyID;
    }


    public void ObservableLisToArray(){
        //List<Property> showing = properties.getItems();
    }



}