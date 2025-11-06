package mypokemons;

import mymoves.Igglybuff.*;
import ru.ifmo.se.pokemon.*;


public class Igglybuff extends Pokemon {
    public Igglybuff(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(90, 30, 15, 40, 20, 15);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        Confide confide = new Confide(0, 0);
        super.setMove(flamethrower, confide);
    }
}
