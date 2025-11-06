package mypokemons;


import mymoves.zekrom.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Zekrom extends Pokemon {

    public Zekrom(String name, int level) {
        super(name, level);

        super.setType(Type.DRAGON, Type.ELECTRIC);
        super.setStats(100, 150, 120, 120, 100, 90);

        Thunder thunder = new Thunder(110, 75);
        DragonRage dragonRage = new DragonRage(40, 100);
        DragonClaw dragonClaw = new DragonClaw(80, 100);
        DoubleTeam doubleTeam = new DoubleTeam(0, 0);
        super.setMove(thunder, dragonRage, dragonClaw, doubleTeam);


    }

}
