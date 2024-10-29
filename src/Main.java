package src;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Move;



import src.pokemons.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // CREATING POKEMONS
        Bouffalant bouffalant = new Bouffalant("Bouffalant", 40);
        Natu natu = new Natu("Natu", 40);
        Xatu xatu = new Xatu("Xatu", 34);
        Tynamo tynamo = new Tynamo("Tynamo", 1);
        Eelektrik eelektrik = new Eelektrik("Eelektrik", 1);
        Eelektross eelektross = new Eelektross("Eelektross", 1);
        // END OF CREATING INITIALIZATION

        //BATTLE INITIALIZATION
        Battle battle = new Battle();
        // END OF BATTLE INITIALIZATION

//        battle.addFoe(bouffalant);
//        battle.addAlly(eelektross);
//        battle.go();


        int numberAlly = 1;
        int numberFoe = 1;


        Pokemon pokeMassive1[] = new Pokemon[6];
        pokeMassive1[0] = bouffalant;
        pokeMassive1[1] = natu;
        pokeMassive1[2] = xatu;
        pokeMassive1[3] = tynamo;
        pokeMassive1[4] = eelektrik;
        pokeMassive1[5] = eelektross;

        
        Pokemon pokeMassiveAlly[] = new Pokemon[numberAlly];
        Pokemon pokeMassiveFoe[] = new Pokemon[numberFoe];

        Random rand = new Random();

        for (int i = 0; i < numberAlly; i++) {
            int checkNumber1;
            checkNumber1 = rand.nextInt(0, pokeMassive1.length);
            battle.addAlly(pokeMassive1[checkNumber1]);
            pokeMassiveAlly[i] = pokeMassive1[checkNumber1];
        }

        for (int i = 0; i < numberFoe; i++) {
            int checkNumber2;
            checkNumber2 = rand.nextInt(0, pokeMassive1.length);
            battle.addFoe(pokeMassive1[checkNumber2]);
            pokeMassiveFoe[i] = pokeMassive1[checkNumber2];
        }

//        pokeMassiveAlly[0] = pokeMassive1[3];
//        pokeMassiveFoe[0] = pokeMassive1[3];
//
//        battle.addAlly(pokeMassiveAlly[0]);
//        battle.addFoe(pokeMassiveFoe[0]);

        battle.go();


    }
}
