package mymoves.Salazzle;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pound extends PhysicalMove {

    public Pound(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применяет " + pieces[pieces.length-1];
    }
}
