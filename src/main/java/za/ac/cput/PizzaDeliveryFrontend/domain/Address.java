package za.ac.cput.PizzaDeliveryFrontend.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

/*
Address.java
Address entity
Author: Tamryn Lisa Lewin (219211981)
Date: 04 April 2023
Last update: July 2023
 */


public class Address {

    private String addressId;
    private String streetNumber;
    private String streetName;
    private String flatNumber;
    private String suburb;
    private String city;
    private String province;
    private String country;
    private String postalCode;
    private za.ac.cput.PizzaDeliveryFrontend.domain.AddressType addressType;

    protected Address() {}

    private Address(Builder builder) {
        this.addressId = builder.addressId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.flatNumber = builder.flatNumber;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.province = builder.province;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
        this.addressType = builder.addressType;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public za.ac.cput.PizzaDeliveryFrontend.domain.AddressType getAddressType() {
        return addressType;
    }

    public static class Builder {
        private String addressId;
        private String streetNumber;
        private String streetName;
        private String flatNumber;
        private String suburb;
        private String city;
        private String province;
        private String country;
        private String postalCode;
        private za.ac.cput.PizzaDeliveryFrontend.domain.AddressType addressType;

        public Builder setAddressId(String addressId) {
            this.addressId = addressId;
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

        public Builder setFlatNumber(String flatNumber) {
            this.flatNumber = flatNumber;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setAddressType(za.ac.cput.PizzaDeliveryFrontend.domain.AddressType addressType) {
            this.addressType = addressType;
            return this;
        }

        public Builder copy(Address address) {
            this.addressId = address.addressId;
            this.streetNumber = address.streetNumber;
            this.streetName = address.streetName;
            this.flatNumber = address.flatNumber;
            this.suburb = address.suburb;
            this.city = address.city;
            this.province = address.province;
            this.country = address.country;
            this.postalCode = address.postalCode;
            this.addressType = address.addressType;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return addressId.equals(address.addressId) && streetNumber.equals(address.streetNumber) && streetName.equals(address.streetName) && Objects.equals(flatNumber, address.flatNumber) && suburb.equals(address.suburb) && city.equals(address.city) && province.equals(address.province) && country.equals(address.country) && postalCode.equals(address.postalCode) && addressType == address.addressType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressId, streetNumber, streetName, flatNumber, suburb, city, province, country, postalCode, addressType);
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId='" + addressId + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", addressType=" + addressType +
                '}';
    }
}
