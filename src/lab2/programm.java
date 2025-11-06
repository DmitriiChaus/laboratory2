package lab2;

import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.*;

public class programm {
   public static void main (String[] args){
       start();
   }

    private static void start(){
        Battle b = new Battle();
        Zekrom z1 = new Zekrom("Molotok", 1);
        Wigglytuff z2 = new Wigglytuff("Drel", 1);
        Salazzle z3 = new Salazzle("Shrupovert", 1);
        Salandit z4 = new Salandit("Otvertka", 1);
        Jigglypuff z5 = new Jigglypuff("GaichniyKluch", 1);
        Igglybuff z6 = new Igglybuff("Perforator", 1);

        b.addAlly(z1);
        b.addAlly(z3);
        b.addAlly(z5);

        b.addFoe(z2);
        b.addFoe(z4);
        b.addFoe(z6);

        b.go();

    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}
