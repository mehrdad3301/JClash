package model.cards.troops;

import javafx.scene.image.Image;
import model.cards.CellValue;
import model.cards.levelEnums.Level;
import model.cards.levelEnums.ArcherLevel;
import model.cards.troops.enums.Speed;
import model.cards.troops.enums.Target;

import java.io.Serializable;
import java.security.SecureRandom;

public class Archer extends Troop implements Serializable{

    private ArcherLevel level;
    public Archer(ArcherLevel level) {
        super(CellValue.ARCHER, level.getHitPoint(), level.getDamage(), Speed.MEDIUM, 1.2f, Target.ANY, 3, 2,5);
        this.level = level;
    }

}
