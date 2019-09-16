package io.test.spring;

public class BaseballCoach implements Coach {

	private FortuneService service;

	public String getDailyWorkout() {
		System.out.println("BASKET: " + service.getFortune());
		return "Spend 30 minutes on batting practice";
	}

	public void setService(FortuneService service) {
		this.service = service;
	}
}








