package ru.evgen.tests;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Unit u1 = new Unit("ork1");
        u1.setName("ork2");
        u1.doVoice();
        System.out.println("Health = " + u1.getHealth());
        System.out.println("------------");
        u1.setresources(ResTypes.GOLD, 15);
        System.out.println(u1.getName() + " " + u1.getHealth());
        u1.printResources();
        u1.setresources(ResTypes.EATS, 10);
        System.out.println(u1.getName() + " " + u1.getHealth());
        u1.printResources();
        u1.setresources(ResTypes.GOLD, 15);
        System.out.println(u1.getName() + " " + u1.getHealth());
        u1.printResources();
        System.out.println(u1);

    }
}
