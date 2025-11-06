package mypokemons;

import mymoves.Wigglytuff.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wigglytuff extends Pokemon {
    public Wigglytuff(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(140, 70, 45, 85, 50, 45);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        Confide confide = new Confide(0, 0);
        BodySlam bodySlam = new BodySlam(85, 100);
        DoubleEdge doubleEdge = new DoubleEdge(40, 100);
        super.setMove(flamethrower, confide, bodySlam, doubleEdge);
    }
}
