package com.company.model.cards.troops;

import com.company.model.cards.troops.enums.Level;
import com.company.model.cards.troops.enums.Speed;
import com.company.model.cards.troops.enums.Target;

public abstract class Troop {
    private Level level ;

    private int hitPoint ;
    private int damage ;
    private Speed speed ;
    private int hitSpeed ;
    private Target target ;
    private int cost ;
    private int count ;

}
