import ru.ifmo.se.pokemon.Pokemon;

public class Tynamo {
    public Pokemon Tynamo = new Pokemon("Tynamo", 10);

    double hp = 35;
    double att = 55;
    double def = 40;
    double spAtt = 45;
    double spDef = 40;
    double speed = 60;

    public final void setStats(double hp,
                               double att,
                               double def,
                               double spAtt,
                               double spDef,
                               double speed){
        setStats(hp,att,def,spAtt,spDef,speed);
    }
}
