package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by J.Wolter on 16.09.2017.
 */

@Component
@Scope("prototype")
public class ChampionService {

    @Autowired
    ChampionRepository championRepository;

    public List<Champion> findAll () {
        List<Champion> champions = championRepository.findAll();
        return champions;
    }

    public Champion findChampionById (int id) {
        Champion champion = championRepository.findOne(id);
        return champion;
    }

    public Champion insertChampion (Champion champion) {
        championRepository.save(champion);
        return champion;
    }
}
