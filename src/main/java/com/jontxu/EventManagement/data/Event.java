package com.jontxu.EventManagement.data;

import java.util.List;

public abstract class Event {
    private final List<Guest> guests;

    protected Event(List<Guest> guests) {
        this.guests = guests;
    }

    public List<Guest> getGuests() {
        return guests;
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }
    public void removeGuest(Guest guest){
        guests.remove(guest);
    }
}
