package com.springframework.sfgdi;

import java.util.Optional;

public class PetServiceFactory {
    public PetService get(String type) {
        switch (type) {
            case "cat":
                return new CatPetService();
            case "dog":
                return new DogPetService();
            default:
                return null;
        }
    }
}
