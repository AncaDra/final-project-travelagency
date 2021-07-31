package com.ancadragomir.sda.travelbooking.model;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "trip_details")
public class TripDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "start_date")
    private Timestamp startDate;
    @Column(name = "end_date")
    private Timestamp endDate;
    @Column(name = "no_of_visitors")
    private Integer noOfVisitors;
    @Column(name = "no_of_rooms")
    private Integer noOfRooms;

    @OneToOne
    @JoinColumn(name = "id")
    private Customer customer;

    public TripDetails(Long id, Timestamp startDate, Timestamp endDate, Integer noOfVisitors, Integer noOfRooms, Customer customer) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.noOfVisitors = noOfVisitors;
        this.noOfRooms = noOfRooms;
        this.customer = customer;
    }

    public TripDetails() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

    public Integer getNoOfVisitors() {
        return noOfVisitors;
    }

    public void setNoOfVisitors(Integer noOfVisitors) {
        this.noOfVisitors = noOfVisitors;
    }

    public Integer getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(Integer noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


}
