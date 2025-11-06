package mypokemons;

import mymoves.Salazzle.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Salazzle extends Pokemon {
    public Salazzle(String name, int level){
        super(name, level);
        super.setType(Type.POISON, Type.FIRE);
        super.setStats(68, 64, 60, 111, 60, 117);

        FireBlast fireBlast = new FireBlast(110, 85);
        NastyPlot nastyPlot = new NastyPlot(0, 0);
        Facade facade = new Facade(70, 100);



        super.setMove(fireBlast, nastyPlot, facade);
    }
}
