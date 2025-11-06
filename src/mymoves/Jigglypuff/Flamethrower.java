package mymoves.Jigglypuff;

import lab2.programm;
import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower(double pow, double acc) {
        super(Type.FIRE, pow, acc);
    }
        @Override
        protected void applyOppEffects(Pokemon p) {
            super.applyOppEffects(p);

            if(programm.chance(0.1)){
                Effect.burn(p);
            }
        }
    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "применяет " + pieces[pieces.length - 1];
    }
    }

