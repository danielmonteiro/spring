package io.test.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach {

  private FortuneService fortuneService;

  @Autowired
  public SoccerCoach(FortuneService fortuneService) {
    this.fortuneService = fortuneService;
  }

  public String getTeamName() {
    return "Soccer team";
  }

  public String getFortune() {
    return fortuneService.getFortune();
  }

}
