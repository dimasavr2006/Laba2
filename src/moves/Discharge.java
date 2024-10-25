package src.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Discharge extends SpecialMove {
    public Discharge(Type type, double pow, double acc) {
        super(type, pow, acc);
    }

    // IMPOSSIBLE AGAIN, BRUH

    public void genAliveList(int numberFoe, Pokemon pokeMassiveFoe[])  {

        int len1 = 0;

        for (int i = 0; i < pokeMassiveFoe.length; i++){
            if (pokeMassiveFoe[i].isAlive() == true){
                len1++;
            } else if (pokeMassiveFoe[i].isAlive() == false) {
                continue;
            }
        }

        Pokemon pokeAliveFoeArray[] = new Pokemon[len1];

        int counter = 0;

        for (int i = 1; i < pokeMassiveFoe.length; i++){
            if (pokeMassiveFoe[i].isAlive() == true){
                pokeAliveFoeArray[counter] = pokeMassiveFoe[i];
                counter++;
            }
        }
    }

    protected void applyier(Pokemon pokeAliveFoeArray[]) {
        for (int i = 0; i < pokeAliveFoeArray.length; i++) {
//            applyOppEffects(pokeAliveFoeArray[i]);
            if (Math.random() < 0.3){
                Effect.paralyze(pokeAliveFoeArray[i]);
                System.out.println("Покемон " + pokeAliveFoeArray[i].toString() + " парализован");
            }
        }
    }



//    protected void applyOppEffects(pokemons pokemons, pokemons pokeAliveFoeArray[]) {
//        if (Math.random() < 0.3) {
//            Effect.paralyze(pokemons);
//            System.out.println("Покемон" + pokeAliveFoeArray[i].toString() + "парализован");
//        }
//    }

    @Override
    protected String describe() {
        return "Использует Discharge";
    }
}
