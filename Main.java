import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Main {

    public static void main(String[] args) {

        // CREATING POKEMONS
        Bouffalant bouffalant = new Bouffalant("Bouffalant", 10);
        Natu natu = new Natu("Natu", 10);
        Xatu xatu = new Xatu("Xatu", 10);
        Tynamo tynamo = new Tynamo("Tynamo", 10);
        Eelektrik eelektrik = new Eelektrik("Eelektrik", 10);
        Eelektross eelektross = new Eelektross("Eelektross", 10);
        // END OF CREATING INITIALIZATION

        //BATTLE INITIALIZATION
        Battle battle = new Battle();
        // END OF BATTLE INITIALIZATION
        battle.addFoe(bouffalant);
        battle.addAlly(eelektross);
        battle.go();
    }
}
