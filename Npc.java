public class Npc{

    private String name;
    private String surname;
    private int age;
    private Specie specie;

    public Npc(String name, String surname, Specie specie, int age){
        this.name = name;
        this.surname = surname;
        this.specie = specie;
        this.age = age;
    }

    public Npc(String name, String surname, Specie specie){
        this(name, surname, specie, specie.generateAge());
    }
}