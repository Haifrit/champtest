package hello;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by J.Wolter on 16.09.2017.
 */

@Component
public interface ChampionRepository extends JpaRepository<Champion, Integer> {
}
