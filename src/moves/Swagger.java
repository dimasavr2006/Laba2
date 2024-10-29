package src.moves;

import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Effect;

public class Swagger extends StatusMove {
    public Swagger(Type type, double power, double accuracy) {
        super(type, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.ATTACK, 2);
        Effect.confuse(pokemon);
        System.out.println("Атака " + pokemon.toString() + " увеличена на 2, покемон оглушён");

//        System.out.println("Атака увеличили на 2, оконфузили");
    }

    @Override
    protected String describe() {
        return "$SWAG$ $SWAG$ $SWAG$";
    }


}
