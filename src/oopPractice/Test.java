package oopPractice;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Sports sports = new Sports("Team USA", "Soccer", true, true, 11);

        Basketball basketball = new Basketball("Miami Heat", "Basketball", true, true, 5);
        Soccer soccer = new Soccer("Inter Miami", "Soccer", true, true, 11);
        Taekwando taekwando = new Taekwando("Team USA", "Fight Sport", false, false, 1);

        System.out.println(basketball);
        System.out.println(soccer);
        System.out.println(taekwando);

        System.out.println("-----------------------------");

        ArrayList<Sports> list = new ArrayList<>();

        list.add(basketball);
        list.add(soccer);
        list.add(taekwando);

        for (Sports each : list) {
            System.out.println(each.getName() + " " + each.getTeamSize());
        }

//        System.out.println(sports);

    }

}
