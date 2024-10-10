import ru.ifmo.se.pokemon.*;

import java.lang.Math;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(Type type, int pow, double acc) {
        super(type, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (Math.random() < 0.7) {
            pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
            System.out.println("Атака увеличена на 1 стадию");
        }
    }

    @Override
    protected String describe() {
        return "Применяет Charge Beam";
    }
}
