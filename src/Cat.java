public class Cat {
    static String species = "Feline";
    public String name;
    public String color;
    protected int age;

    public Cat(String name, String breed, int age){
        this.name = name;
        this.color = breed;
        this.age = age;
    }

    public Cat(){
        name = "Unknown";
        color = "Unknown";
        age = 0;
    }

    public String getColor(){
        return color;
    }

    protected void displayAnimalInfo(){
        System.out.println(name + ", " + color + ", " + age);
    }

    public static void displaySpecies(){
        System.out.println(species);
    }

}
