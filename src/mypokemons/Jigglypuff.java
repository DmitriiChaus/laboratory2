package mypokemons;


import mymoves.Jigglypuff.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Jigglypuff extends Pokemon {
    public Jigglypuff(String name, int level){
        super(name, level);
        super.setType(Type.NORMAL, Type.FAIRY);
        super.setStats(115, 45, 20, 45, 25, 20);

        Flamethrower flamethrower = new Flamethrower(90, 100);
        Confide confide = new Confide(0, 0);
        BodySlam bodySlam = new BodySlam(85, 100);
        super.setMove(flamethrower, confide, bodySlam);
    }
}
