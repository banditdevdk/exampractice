package Zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Zoo {
    private ArrayList<Animal> animals = new ArrayList<>();

    public static void main(String[] args) {

        Zoo zoo = new Zoo();

        Animal a1 = new Animal("John", "Zebra", 3);
        Animal a2 = new Animal("Henrique", "Løve", 10);
        Animal a3 = new Animal("Johnni", "Elefant", 3);

        zoo.animals.add(a1);
        zoo.animals.add(a2);
        zoo.animals.add(a3);

        System.out.println(zoo.animals);

        System.out.println(zoo.getAverageAge());

        System.out.println(zoo.getAnimalsBySpecies("Zebra"));

        Collections.sort(zoo.animals);


    }

    public int getAverageAge() {
        int total = 0;
        for (Animal a: animals) {
            total += a.getAge();
        }
        int result = (total / animals.size());
        return result;
    }

    public ArrayList<Animal> getAnimalsBySpecies(String species) {
        ArrayList<Animal> method = new ArrayList<>();

        for (Animal a: animals) {
            if (a.getSpecies().equalsIgnoreCase(species)) {
                method.add(a);
            }
        }
        return method;
    }
}
