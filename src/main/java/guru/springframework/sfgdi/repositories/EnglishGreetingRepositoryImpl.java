package guru.springframework.sfgdi.repositories;

public class EnglishGreetingRepositoryImpl implements  EnglishGreetingRepository {
    @Override
    public String getGreeting() {
        return "greeting from repository - EN";
    }
}
