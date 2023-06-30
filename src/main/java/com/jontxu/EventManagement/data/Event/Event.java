package com.jontxu.EventManagement.data.Event;

import com.jontxu.EventManagement.data.Employee.Helper;
import com.jontxu.EventManagement.data.Employee.Organiser;

import java.util.List;

public abstract class Event {
    private final List<Guest> guests;
    private final List<Helper> helpers;
    private final List<Organiser> organisers;
    public boolean canStart;
    protected Event(List<Guest> guests, List<Helper> helpers, List<Organiser> organisers) {
        this.guests = guests;
        this.helpers = helpers;
        this.organisers = organisers;
        canStart = false;
    }

    public void setCanStart(){
        canStart = personnelReady();
    };

    public boolean personnelReady(){
        return helpers.size() >= 10 && organisers.size() >= 3 && oneOrganizerIsChief();
    }

    private boolean oneOrganizerIsChief() {
        return this.organisers.stream()
                .anyMatch(Organiser::isChiefOrganiser);
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
