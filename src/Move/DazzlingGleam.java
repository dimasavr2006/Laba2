package src.Move;

import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove{
    public DazzlingGleam(Type type, double pow, double acc){
        super(type, pow, acc);
        }

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

        for (int i = 0; i < pokeMassiveFoe.length; i++){
            if (pokeMassiveFoe[i].isAlive() == true){
                pokeAliveFoeArray[counter] = pokeMassiveFoe[i];
                counter++;
            }
        }
    }

    @Override
    protected double calcBaseDamage(Pokemon pokemon, Pokemon pokemon1) {
        return (super.calcBaseDamage(pokemon, pokemon1)) * (pokemon.getStat(Stat.SPECIAL_ATTACK) / pokemon1.getStat(Stat.SPECIAL_DEFENSE));
    }


    protected void applyier(Pokemon pokemon, Pokemon pokeAliveFoeArray[]){
        for (int i = 0; i < pokeAliveFoeArray.length; i++){

                double hp = pokeAliveFoeArray[i].getStat(Stat.HP) - calcBaseDamage(pokemon, pokeAliveFoeArray[i]);
                double att = pokeAliveFoeArray[i].getStat(Stat.ATTACK);
                double def = pokeAliveFoeArray[i].getStat(Stat.DEFENSE);
                double spAtt = pokeAliveFoeArray[i].getStat(Stat.SPEED);
                double spDef = pokeAliveFoeArray[i].getStat(Stat.SPECIAL_DEFENSE);
                double speed = pokeAliveFoeArray[i].getStat(Stat.SPEED);

                pokeAliveFoeArray[i].setStats(hp, att, def, spAtt, spDef, speed);

                System.out.println(pokemon.toString() + " бьёт по " + pokeAliveFoeArray[i].toString());
        }
    }

    // ATTACK ALL, BUT IT'S IMPOSSIBLE


    @Override
    protected String describe() {
        return "атакует всех";
    }
}

