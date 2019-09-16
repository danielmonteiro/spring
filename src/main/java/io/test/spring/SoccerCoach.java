package io.test.spring;

public class SoccerCoach implements Coach {

    private FortuneService service;

    public SoccerCoach(FortuneService service) {
        this.service = service;
    }

    public String getDailyWorkout() {
        System.out.println(service.getFortune());
        return "GOLLLLL!";
    }
}
