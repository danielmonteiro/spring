package io.test.spring;

public class SoccerCoach implements Coach {

    private FortuneService service;

    private String name;

    private String surname;

    private String email;

    public SoccerCoach(FortuneService service, String name, String surname) {
        this.service = service;
        this.name = name;
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDailyWorkout() {
        System.out.println("Name: " + name + ", Surname: " + surname + ", Email: " + email);
        System.out.println(service.getFortune());
        return "GOLLLLL!";
    }
}
