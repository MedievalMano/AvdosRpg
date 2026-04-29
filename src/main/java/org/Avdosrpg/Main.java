package org.Avdosrpg;
import org.Avdosrpg.models.Warrior;
import org.Avdosrpg.models.Wizard;
import org.Avdosrpg.Gamingloop;

public class Main {
    public static void main(String[] args) {
        Warrior Arda = new Warrior("Arda", 1,35,8,20);
        Warrior.stats();

        Gamingloop.gamingloop();


    }



}
