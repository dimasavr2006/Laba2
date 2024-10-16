package src.Move;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class FocusEnergy extends StatusMove{
    public FocusEnergy (Type type, double pow, double acc){
        super(type, pow, acc);
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
