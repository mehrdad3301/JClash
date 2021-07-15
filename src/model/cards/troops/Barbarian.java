package model.cards.troops;

import model.cards.CellValue;
import model.cards.levelEnums.BarbarianLevel;
import model.cards.troops.attributes.Speed;
import model.cards.troops.attributes.Target;

public class Barbarian extends Troop{
    private BarbarianLevel level;


    public Barbarian(BarbarianLevel level) {
        super(CellValue.BARBERIAN, level.getHitPoint(), level.getDamage(), Speed.MEDIUM, 1.5f, Target.GROUND, 5, 4,0);
        this.level = level ;
    }

}
