package com.ancadragomir.sda.travelbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "hotel_name")
    private String hotelName;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;

    @Column(name = "hotel_address")
    private String hotelAddress;
    @Column(name = "description")
    private String description;
    @Column(name = "no_of_stars")
    private Integer noOfStars;
    @Column(name = "pet_friendly")
    private boolean petFriendly;

    public Hotel(Long id, String hotelName, City city, String hotelAddress, String description, Integer noOfStars, boolean petFriendly) {
        this.id = id;
        this.hotelName = hotelName;
        this.city = city;
        this.hotelAddress = hotelAddress;
        this.description = description;
        this.noOfStars = noOfStars;
        this.petFriendly = petFriendly;
    }

    public Hotel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNoOfStars() {
        return noOfStars;
    }

    public void setNoOfStars(Integer noOfStars) {
        this.noOfStars = noOfStars;
    }

    public boolean isPetFriendly() {
        return petFriendly;
    }

    public void setPetFriendly(boolean petFriendly) {
        this.petFriendly = petFriendly;
    }
}
