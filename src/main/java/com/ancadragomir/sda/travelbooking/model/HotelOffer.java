package com.ancadragomir.sda.travelbooking.model;

import javax.persistence.*;

@Entity
@Table(name = "hotel_offer")
public class HotelOffer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column(name = "price")
    private Double price;

    public HotelOffer(Long id, Hotel hotel, Room room, Double price) {
        this.id = id;
        this.hotel = hotel;
        this.room = room;
        this.price = price;
    }

    public HotelOffer() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
