package org.Avdosrpg;

import com.sun.source.tree.WhileLoopTree;
import org.Avdosrpg.models.Warrior;

public class Gamingloop {
    public static void gamingloop()
    {
        while(Warrior.health > 0)
        {
            Warrior.Basic_Attack();
            Warrior.health -=5;

            System.out.println(Warrior.health);
            if (Warrior.health <= 0){System.out.println("Dead");}

        }





    }
}
