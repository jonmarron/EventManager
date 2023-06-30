package com.jontxu.EventManagement.data;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Conference extends Event {
    private final Map<Guest, Boolean> guestsWithGoodieBag;
    protected Conference(List<Guest> guests) {
        super(guests);
        guestsWithGoodieBag = initializeGuestsWithGoodie();
    }

    public Map<Guest, Boolean> initializeGuestsWithGoodie(){
        return this.getGuests().stream()
                .collect(Collectors.toMap(key -> key, value -> false));
    }

    public void askForGoodieBag(Guest guest){
        guestsWithGoodieBag.entrySet().stream()
                .filter(entry -> entry.getKey().equals(guest))
                .findFirst()
                .ifPresent(entry -> {
                    if (entry.getValue()){
                        throw new IllegalArgumentException("Guest already has a GoodieBag");
                    } else {
                        entry.setValue(true);
                    }
                });
    }



}
