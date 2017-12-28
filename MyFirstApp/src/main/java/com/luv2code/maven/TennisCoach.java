package com.luv2code.maven;

import org.springframework.stereotype.Component;

@Component("thatCoach")
/*spring will scan for this component and automatically registers this as spring bean
with bean id as thatCoach*/
public class TennisCoach implements Coach {

    private FortuneService fortune;

    public TennisCoach(FortuneService fortune)
    {
        this.fortune=fortune;
    }
    public String getDailyWorkout()
    {
         return "Practice Tennis Daily";
    }

    public String getDailyFortune()
    {
        return fortune.getFortune();
    }
}
