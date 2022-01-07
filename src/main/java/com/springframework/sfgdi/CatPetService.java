package com.springframework.sfgdi;

public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "cat";
    }
}
