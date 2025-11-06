package mymoves.Igglybuff;

import lab2.programm;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

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

