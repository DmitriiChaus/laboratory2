package mypokemons;

import mymoves.Salazzle.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Salandit extends Pokemon {

    public Salandit(String name, int level){
        super(name, level);

        super.setType(Type.POISON, Type.FIRE);
        super.setStats(48, 44, 40, 71, 40, 77);

        FireBlast fireBlast = new FireBlast(110, 85);
        NastyPlot nastyPlot = new NastyPlot(0, 0);
        Facade facade = new Facade(70, 100);
        Pound pound = new Pound(40, 100);


        super.setMove(fireBlast, nastyPlot, facade, pound);

    }
}
