package com.jontxu.EventManagement.data;

import java.util.List;
import java.util.Map;

public class CocktailParty extends Event {
    private final Map<String, Integer> cocktailsList;

    public CocktailParty(List<Guest> guests,Map<String, Integer> cocktailsList) {
        super(guests);
        this.cocktailsList = cocktailsList;
    }
    public void orderCocktail(String cocktail){
        cocktailsList.entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(cocktail))
                .findFirst()
                .ifPresent(entry -> {
                    if (entry.getValue() == 0){
                        throw new IllegalArgumentException("There are no more " + cocktail + "s");
                    } else {
                        entry.setValue(entry.getValue() - 1);
                    }
                });
    }
}
