package mymoves.Salazzle;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {
    public NastyPlot(double pow, double acc){
        super(Type.DARK, pow, acc);


    }

    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);

        Effect e = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);
    }


@Override
protected String describe(){
    String[] pieces = this.getClass().toString().split("\\.");
    return "применяет " + pieces[pieces.length-1];

}
}
