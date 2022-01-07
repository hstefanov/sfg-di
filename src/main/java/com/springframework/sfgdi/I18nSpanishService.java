package com.springframework.sfgdi;

import guru.springframework.sfgdi.services.GreetingService;

public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello world from greeting service - Spanish greeting!";
    }
}
