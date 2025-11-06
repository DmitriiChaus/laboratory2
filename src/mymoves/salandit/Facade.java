package mymoves.salandit;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double damage) {
        switch (p.getCondition()) {
            case BURN -> p.setMod(Stat.HP, (int) Math.round(damage * 2));
            case POISON -> p.setMod(Stat.HP, (int) Math.round(damage * 2));
            case PARALYZE -> p.setMod(Stat.HP, (int) Math.round(damage * 2));
            default -> p.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "применяет " + pieces[pieces.length - 1];
    }
}