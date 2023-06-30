package com.jontxu.EventManagement.data.Event;

import com.jontxu.EventManagement.data.Employee.Helper;
import com.jontxu.EventManagement.data.Employee.Organiser;

import java.util.List;

public class Wedding extends Event {
    private boolean hasCake;

    public Wedding(List<Guest> guests, List<Helper> helpers, List<Organiser> organisers, boolean hasCake) {
        super(guests, helpers, organisers);
        this.hasCake = hasCake;
    }

    @Override
    public void setCanStart(){
        canStart = personnelReady() && hasCake;
    }
    public boolean isHasCake() {
        return hasCake;
    }
    public void setHasCake(boolean hasCake) {
        this.hasCake = hasCake;
    }

}
