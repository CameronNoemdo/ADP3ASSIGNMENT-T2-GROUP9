package za.ac.cput.domain.location;
import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.*;

import za.ac.cput.domain.region.City;
/*
Address.java
@Author Themba Khanyile
Student Number: 217238173
Date: 11 June 2022
 */

@Embeddable
@Access(AccessType.FIELD)
public class Address implements Serializable {


    
    private String unitNumber;
    private String complexName;
    @NotNull
    private String streetNumber;
    private String streetName;
    private int postalCode;
    @Embedded
    @ManyToOne
    private City city;

    public void setCity(City city) {
        this.city = city;
    }

    @SuppressWarnings("unused")
    //Parameterless constructor
    protected Address(){}

    public Address(Builder builder) {
        this.unitNumber = builder.unitNumber;
        this.complexName = builder.complexName;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.postalCode = builder.postalCode;
        this.city = builder.city;

    }

    //Getters

    public String getUnitNumber() {
        return unitNumber;
    }
    public String getComplexName() {
        return complexName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }
    public int getPostalCode() {
        return postalCode;
    }


    public City getCity() {
        return city;
    }


    public static class Builder{
        private String unitNumber;
        private String complexName;
        private String streetNumber;
        private String streetName;
        private int postalCode;
        private City city;



        //Setters
        public Builder setUnitNumber(String unitNumber) {
            this.unitNumber = unitNumber;
            return this;
        }


        public Builder setComplexName(String complexName) {
            this.complexName = complexName;
            return this;
        }



        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }



        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }


        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }


        public Builder setCity(City city) {
            this.city = city;
            return this;
        }

        public Address build()
        {
            return new Address(this);
        }
    }

    @Override
    public String toString() {
        return "Address{" +
                "unitNumber='" + unitNumber + '\'' +
                ", complexName='" + complexName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", postalCode=" + postalCode +
                ", city='" + city + '\'' +
                '}';
    }

    //Object validation

    public boolean verify(Object n)
    {
        if(this==n) return true;
        if(n == null || getClass()!= n.getClass()) return false;
        Address address = (Address) n;
        return unitNumber.equals(address.unitNumber);
    }

}





