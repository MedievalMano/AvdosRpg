package org.Avdosrpg;
import org.Avdosrpg.models.Warrior;
import org.Avdosrpg.models.Wizard;

public class Main {
    public static void main(String[] args) {
        Warrior Arda = new Warrior("Arda", 1,35,8,20);
        Warrior.stats();
        Warrior.Basic_Attack();
    }


}
