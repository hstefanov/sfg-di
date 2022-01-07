package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean(){
        System.out.println("Creating a singleton bean.");
    }

    public String getMessage(){
        return "I am a singleton bean";
    }
}
