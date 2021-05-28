package day47_constructor;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Address {

    //Encapsulate -private data in the address:
    //street
    //city
    //state
    //zipcode
    //country

private String street;
private String city;
private String state;
private String zipcode;
private String country = "USA";

// CONSTRUCTOR CLASS
public Address (){
    System.out.println("Address constructor ");
    street = "123 unknown st";
    city = " unknown";
    state = " unknown";
    zipcode =" unknown";
}
//second constructor OVELOADED CONSTRUCTOR, PROVIDES shortcut to intialize
    //in the same statement: exp Address = new Address("123 java st", "boston")
public Address(String street, String city, String state, String zipcode){
    this.street= street;
    setStreet(street);
}



//generate : getters/setters
// generate :toString
//   "123 JAva St Apt 101, Selenium, Va, 22102"

@Override
public String toString(){
    return street + ", "+ city+state+ "" + zipcode;
}

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
