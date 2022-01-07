package com.springframework.sfgdi;

public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "dog";
    }
}
