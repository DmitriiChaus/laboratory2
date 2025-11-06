package mymoves.zekrom;

import lab2.programm;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder(double pow, double acc){
        super(Type.ELECTRIC, pow, acc);


    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);

        if (programm.chance(0.3)){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применяет " + pieces[pieces.length-1];

    }
}
