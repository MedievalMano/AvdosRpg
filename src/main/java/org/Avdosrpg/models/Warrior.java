package org.Avdosrpg.models;

import com.sun.jdi.request.MonitorWaitRequest;
import org.Avdosrpg.models.Ab.Ab_Live;
import org.Avdosrpg.models.Interfaces.BasicAttack;

public class Warrior extends Ab_Live implements BasicAttack {



    public Warrior(String name, int level, int health, int mana, int stamina) {
        Warrior.name = name;
        Warrior.level = level;
        Warrior.health = health;
        Warrior.mana = mana;
        Warrior.stamina = stamina;
    }

    public static void stats(){
        System.out.println("Warrior Stats");
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Stamina: " + stamina);



    }
    public static void Basic_Attack(){
        System.out.println("Warrior Begun To Attack");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Warrior Attacked");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Warrior Dealed 2 hp");



    }









}
