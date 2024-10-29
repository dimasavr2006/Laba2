package src.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class FocusEnergy extends StatusMove{
    public FocusEnergy (Type type, double power, double accuracy){
        super(type, power, accuracy);
    }

//    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return 2;
    }

    @Override
    protected String describe() {
        return "ЗАРЯЖАЕТ АТАКУ!";
    }
}
