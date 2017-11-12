package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.*;

/**
 * Created by J.Wolter on 17.09.2017.
 */

@Configuration
public class MyConfiguration {

    @Bean
    @Scope("prototype")
    public ChampionService championService () {
        ChampionService championService = new ChampionService();
        return championService;
    }

}
