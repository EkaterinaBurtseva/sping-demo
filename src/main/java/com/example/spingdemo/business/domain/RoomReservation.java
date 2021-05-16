package com.example.spingdemo.business.domain;

import java.util.Date;

public class RoomReservation {
    private long roomId;
    private long guestIs;
    private String roomNumber;
    private String roomName;
    private String firstName;
    private String lastName;
    private Date date;

    public long getGuestIs() {
        return guestIs;
    }

    public void setGuestId(long guestIs) {
        this.guestIs = guestIs;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
}
