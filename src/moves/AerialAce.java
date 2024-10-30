package src.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove{

    public AerialAce (Type type, double power, double acc){
        super(type, power, acc);
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        return true;
    }

//    @Override
//    protected String describe() {
//        return "Попадает всегда";
//    }


}
