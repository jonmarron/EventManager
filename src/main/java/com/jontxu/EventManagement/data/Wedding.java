package com.jontxu.EventManagement.data;

import java.util.List;

public class Wedding extends Event {
    private boolean hasCake;
    private boolean canStart;

    public Wedding(List<Guest> guests, boolean hasCake) {
        super(guests);
        this.hasCake = hasCake;
        canStart = hasCake;
    }

    public boolean isHasCake() {
        return hasCake;
    }

    public boolean isCanStart() {
        return canStart;
    }

    public void setHasCake(boolean hasCake) {
        this.hasCake = hasCake;
    }

    public void setCanStart(boolean canStart) {
        this.canStart = canStart;
    }
}
