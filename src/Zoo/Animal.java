package Zoo;

public class Animal implements Comparable<Animal> {
    private String name;
    private String species;
    private int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return " " + name + " " + species + " " + age + " ";
    }

    //alder compare
    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }
}
