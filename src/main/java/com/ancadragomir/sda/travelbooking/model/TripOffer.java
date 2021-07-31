package com.ancadragomir.sda.travelbooking.model;

import javax.persistence.*;

@Entity
@Table(name ="trip_offer")
public class TripOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name="id")
    private Long id;

    @OneToOne
    @JoinColumn (name ="hotel_offer_id")
    private HotelOffer hotelOffer;

    @OneToOne
    @JoinColumn (name = "trip_details_id")
    private TripDetails tripDetails;

    @Column (name = "amount")
    private Double amount;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;


    public TripOffer(Long id, HotelOffer hotelOffer, TripDetails tripDetails, Double amount, Status status) {
        this.id = id;
        this.hotelOffer = hotelOffer;
        this.tripDetails = tripDetails;
        this.amount = amount;
        this.status = status;
    }

    public TripOffer() {

    }
}
