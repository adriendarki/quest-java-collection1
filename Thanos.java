import java.util.*;

public class Thanos {

    public static void main(String[] args) {

        // TODO 6 : Loop throught the list and display the name of the remaining heroes

        // Create an empty heroes list
        List<Hero> heroes = new ArrayList<>();

        // Add those heroes to the list
        // name: Black Widow, 34
        // name: Captain America, 100
        // name: Vision, 3
        // name: Iron Man, 48
        // name: Scarlet Witch, 29
        // name: Thor, 1500
        // name: Spider-Man, 18
        // name: Hulk, 49
        // name: Doctor Strange, 42
        heroes = Arrays.asList(new Hero("Black Widow", 34), new Hero("Captain America", 100), new Hero("Vision", 3),
                new Hero("Iron Man", 48), new Hero("Scarlet Witch", 29), new Hero("Thor", 1500),
                new Hero("Spider-Man", 18), new Hero("Hulk", 49), new Hero("Doctor Strange", 42));

        // It's Thor birthday, now he's 1501
        Hero thor = heroes.stream().filter(hero -> "Thor".equals(hero.getName())).findFirst().get();
        thor.setAge(thor.getAge() + 1);
        System.out.println("Full heroes list before shuffling:");
        System.out.println();
        for (Hero hero : heroes) {
            System.out.println(hero.toString());
        }

        // Shuffle the heroes list
        Collections.shuffle(heroes);

        // Keep only the half of the list
        int heroesSize = heroes.size();
        List<Hero> heroesHalf = heroes.subList(0, heroesSize/2);

        // Loop through the list and display the name of the remaining heroes
        System.out.println();
        System.out.println("Names list of first half of heroes after shuffling:");
        System.out.println();
        for (Hero hero : heroesHalf) {
            System.out.println(hero.getName());
        }
    }
}