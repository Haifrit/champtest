package hello;

import javax.persistence.*;

/**
 * Created by J.Wolter on 15.09.2017.
 */

@Entity
public class Champion {

    private Integer champion_id;

    private String champion_name;

    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getChampion_id() {
        return champion_id;
    }

    public void setChampion_id(Integer champion_id) {
        this.champion_id = champion_id;
    }

    public String getChampion_name() {
        return champion_name;
    }

    public void setChampion_name(String champion_name) {
        this.champion_name = champion_name;
    }
}
