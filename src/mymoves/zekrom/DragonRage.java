package mymoves.zekrom;


import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DragonRage extends SpecialMove {
    public DragonRage(double pow, double acc){
        super(Type.DRAGON, pow, acc);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применяет " + pieces[pieces.length-1];

    }
}
