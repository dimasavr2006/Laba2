package src.moves;

import ru.ifmo.se.pokemon.*;

import java.lang.Math;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (Math.random() < 0.7) {
            pokemon.setMod(Stat.SPECIAL_ATTACK, 1);
            System.out.println("Атака увеличена " + pokemon.toString() + " на 1 стадию");
        }
    }

    @Override
    protected String describe() {
        return "Применяет Charge Beam";
    }
}
