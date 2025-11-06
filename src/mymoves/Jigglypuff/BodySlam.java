package mymoves.Jigglypuff;

import lab2.programm;
import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam(double pow, double acc){
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if(programm.chance(0.3)){
            Effect.paralyze(p);
        }
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применяет " + pieces[pieces.length-1];

    }
}


